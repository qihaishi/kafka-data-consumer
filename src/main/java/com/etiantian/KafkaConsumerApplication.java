package com.etiantian;

import com.etiantian.launcher.SpringContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableKafka
@Import(value={SpringContext.class})
@ComponentScan(value = "com.etiantian")
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
}
