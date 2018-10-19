package com.ini;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RunApplicationServer1 {

	public static void main(String[] args) {
		//SpringApplication.run(RunApplication.class, args);
		new SpringApplicationBuilder(RunApplicationServer1.class).web(true).run(args);
	}
}
