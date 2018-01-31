package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


//注解开启配置服务器
@EnableConfigServer
@SpringBootApplication
public class ServiceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigApplication.class, args);
	}
}
