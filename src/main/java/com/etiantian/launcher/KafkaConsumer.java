package com.etiantian.launcher;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by yuchunfan on 2017/2/4.
 */
@Component
public class KafkaConsumer {
    private static Logger logger = Logger.getLogger(KafkaConsumer.class);

   /* @Autowired
    ServiceFacade serviceFacade;

    @Autowired
    PollableChannel channel;
    public void execute() throws IOException {
        while (true) {
            logger.warn("===KafkaConsumer execute===");
            // 减小poll间隔
            Message<?> received = channel.receive(500L);
            if(received != null) {
                KafkaMessageHeaders headers = (KafkaMessageHeaders) received.getHeaders();
                Map<String, Object> map = headers.getRawHeaders();
                String topic= map.get("kafka_receivedTopic").toString();
                String value= received.getPayload().toString();
                logger.warn("Kafka Msg Value:"+value);
                try {
                    serviceFacade.doService(topic, new JSONObject(value));
                } catch (Exception e) {
                    logger.error("Message format error!! "+ received+ "\n",e);
                }
            }
        }
    }*/
}
