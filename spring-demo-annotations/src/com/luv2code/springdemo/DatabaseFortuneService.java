package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService{


    @Override
    public String getFortune() {

        return null;
    }
}
