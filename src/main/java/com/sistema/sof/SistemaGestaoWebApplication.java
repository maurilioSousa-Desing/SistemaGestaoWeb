package com.sistema.sof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Francisco
 *
 */
@SpringBootApplication
@EntityScan(basePackages = "com.sistema.sof.entity")
@ComponentScan(basePackages = {"com.*"})

public class SistemaGestaoWebApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SistemaGestaoWebApplication.class, args);
		
		//System.out.println("Ola Mundo");
		//this.formularioRegistrarPonto.html;
		
	}

}
