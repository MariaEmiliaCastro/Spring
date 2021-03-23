package com.luv2code.practice7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActivityRun {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(CoachConfig.class);

        Coach getCoach = context.getBean("gamingCoach", Coach.class);

        System.out.println(getCoach.getDailyWorkout());
        System.out.println(getCoach.getDailyFortune());

        context.close();
    }
}
