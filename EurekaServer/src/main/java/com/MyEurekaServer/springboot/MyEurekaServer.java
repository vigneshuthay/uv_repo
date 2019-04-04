package com.MyEurekaServer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class MyEurekaServer {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyEurekaServer.class, args);
		//System.out.println(ctx);
	}
}

