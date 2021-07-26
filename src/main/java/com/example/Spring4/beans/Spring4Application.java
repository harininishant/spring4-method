package com.example.Spring4.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Spring4Application {

	public static void main(String[] args) {
		ApplicationContext C= new AnnotationConfigApplicationContext(Appconf.class);
		System.out.println(C.getBean("game", Game.class).playGame());
		((ConfigurableApplicationContext) C).registerShutdownHook();// to shut the config we use this
		// to call predestroy anotation

	}

}
