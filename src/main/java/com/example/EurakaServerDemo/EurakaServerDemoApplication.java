package com.example.EurakaServerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaServerDemoApplication.class, args);
	}

}
