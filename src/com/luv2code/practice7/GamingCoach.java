package com.luv2code.practice7;

public class GamingCoach implements Coach {

    FortuneService fortuneService;

    public GamingCoach() {
    }

    public GamingCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Go play for 20 hours!";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
