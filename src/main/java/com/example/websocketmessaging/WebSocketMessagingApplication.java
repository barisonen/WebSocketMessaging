package com.example.websocketmessaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebSocketMessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketMessagingApplication.class, args);
	}

}
