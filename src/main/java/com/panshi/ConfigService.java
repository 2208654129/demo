package com.panshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigService {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigService.class, args);
	}

}