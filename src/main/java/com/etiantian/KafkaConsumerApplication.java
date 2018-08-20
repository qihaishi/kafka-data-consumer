package com.etiantian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ImportResource("classpath:spring/applicationContext.xml")
public class KafkaConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
}
