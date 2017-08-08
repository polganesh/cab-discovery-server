package com.gp.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerBootstrap {

	public DiscoveryServerBootstrap() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerBootstrap.class, args);
	}


}
