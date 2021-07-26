package com.example.Spring4.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class WhiteSox implements ITeam{

    @Value("${game.away.team}")
    private String name;
    @Value("#{${game.away.score}+ 6}")
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




