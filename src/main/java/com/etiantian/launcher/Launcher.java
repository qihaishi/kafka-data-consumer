package com.etiantian.launcher;

import com.etiantian.service.ServiceFacade;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by yuchunfan on 2017/2/4.
 */
public class Launcher {

    public static void main(String[] args) throws IOException, ParseException {
        new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        KafkaConsumer kafkaConsumer = SpringContext.getBean("kafkaConsumer", KafkaConsumer.class);
        kafkaConsumer.execute();
    }
}
