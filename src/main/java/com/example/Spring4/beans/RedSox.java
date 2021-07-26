package com.example.Spring4.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class RedSox implements ITeam{
    //@Value("#{${home.team}==true?${game.home.team}:'MYTEAM'}")// creating tertiary for redsox
       //@Value("#{new String('ABC')}")// output RedSox(name=ABC, score=42) // creating object name abc instead of toronto raptors
    //@Value("#{new String('ABC').toLowerCase()}")//output RedSox(name=abc, score=42)
  @Value("#{T(com.example.Spring4.beans.NameProvider).getName()}") // calling methods from Nameprovider class
    //@Value("#{names2.getMeSomething()}")// calling method from names class
    private String name;
    //@Value("#{${game.home.score} + 10}") // adding to the redsox score
    //@Value("#{ T(java.lang.Math).random()*1000}") // T is for static method calling
    private int score;

    @Override
    public String getTeamName() {
        return name;
    }

    @Override
    public int getTeamScore() {
        return score;
    }
}
