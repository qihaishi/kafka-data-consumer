package com.etiantian.launcher;

import com.etiantian.service.ServiceFacade;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.converter.KafkaMessageHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * Created by yuchunfan on 2017/2/4.
 */
@Component
public class KafkaConsumer {
    private static Logger logger = Logger.getLogger(KafkaConsumer.class);

    @Autowired
    ServiceFacade serviceFacade;

    @Autowired
    PollableChannel channel;
    public void execute() throws IOException {
        while (true) {
            //logger.warn("===KafkaConsumer execute===");
            Message<?> received = channel.receive(1000L);
            if(received != null) {
                KafkaMessageHeaders headers = (KafkaMessageHeaders) received.getHeaders();
                Map<String, Object> map = headers.getRawHeaders();
                String topic= map.get("kafka_receivedTopic").toString();
                String value= received.getPayload().toString();
                //logger.warn("Kafka Msg Value:"+value);
                try {
                    serviceFacade.doService(topic, new JSONObject(value));
                } catch (JSONException e) {
                    logger.error("Message format error!! "+ received+ "\n",e);
                }
            }
        }
    }
}
