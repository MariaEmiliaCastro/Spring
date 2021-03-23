package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Component
public class FileFortunes implements FortuneService{

    private List<String> theFortunes;
    private Random myRandom = new Random();


    @PostConstruct
    public String readLineByLineJava8() {

        String filePath = "C:\\Users\\lilee\\Documents\\spring-learning\\eclipse-ws\\spring-demo-annotations\\src\\fortunes.txt";
        System.out.println("Inside PostConstruct of the FileFortunes");
        BufferedReader reader;

        theFortunes = new ArrayList<String>();

        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\lilee\\Documents\\spring-learning\\eclipse-ws\\spring-demo-annotations\\src\\fortunes.txt"));
            String line = reader.readLine();
            while (line != null) {
                theFortunes.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int index = myRandom.nextInt(theFortunes.size());

        String theFortune = theFortunes.get(index);

        System.out.println("File read!");

        return theFortune;

    }


    @Override
    public String getFortune() {

        String bla = readLineByLineJava8();

        return bla;
    }
}
