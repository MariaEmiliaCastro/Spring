package com.luv2code.practice7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    @Bean
    public FortuneService dailyFortune(){
        return new DailyFortune();
    }

    @Bean(name="gamingCoach")
    public Coach gamingCoach(){
        GamingCoach myGamingCoach = new GamingCoach(dailyFortune());

        return myGamingCoach;
    }


}
