package com.example.Spring4.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;



@ComponentScan(basePackages ="com.example.Spring4.beans") // inorder to scan the values from package
@PropertySource("classpath:application.properties")
public class Appconf {
}

