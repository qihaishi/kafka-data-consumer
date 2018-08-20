package com.etiantian.consumer;


import com.etiantian.service.ServiceFacade;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;



/**
 * Created by chentong on 2018/2/27.
 */
@Service
@Slf4j
public class KafkaMessageListener implements AcknowledgingMessageListener<String, String> {

    @Autowired
    ServiceFacade serviceFacade;


    /**
     * 监听kafka消息
     *
     * @param stringStringConsumerRecord
     * @param acknowledgment
     */
    @KafkaListener(topics = "#{'${spring.kafka.topics}'.split(',')}")
    @Override
    public void onMessage(ConsumerRecord<String, String> stringStringConsumerRecord, Acknowledgment acknowledgment) {
        long start = System.currentTimeMillis();
        log.warn("===KafkaConsumer execute===");
        if (stringStringConsumerRecord != null) {
            String message = stringStringConsumerRecord.value();
            String topic = stringStringConsumerRecord.topic();
            log.warn("Kafka Msg Value:"+message);
            if (message != null && topic != null) {
                try {
                    serviceFacade.doService(topic, new JSONObject(message));
                } catch (Exception e) {
                    log.warn("Message format error!! "+ stringStringConsumerRecord+ "\n",e);
                }
            }

        }
        acknowledgment.acknowledge();
        log.warn("=====EXECUTE THREAD：" + Thread.currentThread().getId() + "====== costTime："+(System.currentTimeMillis() - start) + " ms");
    }
}
