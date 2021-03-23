package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence us the mother of good luck",
            "The journey is the reward"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}