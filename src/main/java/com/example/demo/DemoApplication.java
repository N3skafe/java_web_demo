package com.example.demo; //folder location

import org.springframework.boot.SpringApplication; //spring main class
import org.springframework.boot.autoconfigure.SpringBootApplication; //spring boot annotation, auto configuration

@SpringBootApplication //annotation (spring boot application, auto configuration, component scan etc..)
public class DemoApplication { //class name

	public static void main(String[] args) { //main method
		SpringApplication.run(DemoApplication.class, args); //start the application (run method)
	}

}
