package com.kp.swasthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class CamelProxyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelProxyServerApplication.class, args);
	}

}
