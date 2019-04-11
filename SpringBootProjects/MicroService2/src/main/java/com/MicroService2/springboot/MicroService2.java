package com.MicroService2.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class MicroService2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MicroService2.class, args);
		//System.out.println(ctx);
	}
}

