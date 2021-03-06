package com.luv2code.springdemo;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyWorkout() {

        return fortuneService.getFortune();
    }
}
