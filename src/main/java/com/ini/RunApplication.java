package com.ini;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RunApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RunApplication.class, args);
		new SpringApplicationBuilder(RunApplication.class).web(true).run(args);
	}
}
