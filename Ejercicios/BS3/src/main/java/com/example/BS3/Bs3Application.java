package com.example.BS3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bs3Application implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(Bs3Application.class, args);}

	@Override
	public void run(String... args) throws Exception {System.out.println("Hola desde la clase inicial");}

	}
