package com.example.Spring4.beans;

import org.springframework.stereotype.Component;

@Component("names2")
public class Names {
    public String getMeSomething(){ // bean name was defined hence beanname.method in redsox
        return "Spring is good and bad";
    }
}
