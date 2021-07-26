package com.example.Spring4.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Data
@Component
public class Game {

    private ITeam homeTeam;
    private ITeam awayTeam;

    public Game(@Qualifier("redSox") ITeam homeTeam, @Qualifier("whiteSox") ITeam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @PostConstruct
    public void initGame() {
        System.out.println("@@@@@@@@@@ GAME IS ON @@@@@@@@@@@@@@");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@@@@@@@@@@ GAME ENDED @@@@@@@@@@@@");
    }

    public ITeam playGame() {
       return Math.random() * 10 > 1 ? homeTeam : awayTeam;
       // return awayTeam;
    }


}
