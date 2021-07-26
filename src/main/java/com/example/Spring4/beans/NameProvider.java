package com.example.Spring4.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public  class NameProvider { // we called class.method in redsox hence gave package name
    public static String getName(){
        return " provider";
    }
}
