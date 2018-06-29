package com.etiantian.launcher;

import com.etiantian.service.ServiceFacade;
import org.apache.log4j.PropertyConfigurator;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by yuchunfan on 2017/2/4.
 */
public class Launcher {

    public static void main(String[] args) throws IOException, ParseException {
        new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        PropertyConfigurator.configure(new ClassPathResource("log4j.properties").getInputStream());
//
//        KafkaConsumer kafkaConsumer = SpringContext.getBean("kafkaConsumer", KafkaConsumer.class);
//        kafkaConsumer.execute();

        SpringApplication.run(Launcher.class, args);
        ServiceFacade serviceFacade = SpringContext.getBean("serviceFacade", ServiceFacade.class) ;
        serviceFacade.doService("j_material_node_info",new JSONObject());
    }
}
