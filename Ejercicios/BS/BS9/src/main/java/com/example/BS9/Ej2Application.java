package com.example.BS9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ej2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej2Application.class, args);
	}

}
