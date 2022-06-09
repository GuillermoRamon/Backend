package com.example.BS2;

import com.example.BS2.clases.Ciudad;
import com.example.BS2.clases.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Bs2Application {


	public static void main(String[] args) {
		SpringApplication.run(Bs2Application.class, args);
	}
	@Bean
	static ArrayList<Ciudad> lista(){
		ArrayList<Ciudad> lista = new ArrayList<>();
		lista.add(new Ciudad("Madrid",35000));
		lista.add(new Ciudad("Toledo",25000));
		lista.add(new Ciudad("Ciudad real",20000));
		lista.add(new Ciudad("Cuenca",180000));
		lista.add(new Ciudad("Guadalajara",22000));
		lista.add(new Ciudad("Albacete",15000));
		return lista;
	}

	@Bean
	static Persona bean1(){
		return new Persona("pepe",20, "Madrid");
	}

	@Bean
	static Persona bean2(){
		return new Persona("maria",30, "Toledo");
	}
	@Bean
	static Persona bean3(){
		return new Persona("juan",40, "Guadalajara");
	}

}
