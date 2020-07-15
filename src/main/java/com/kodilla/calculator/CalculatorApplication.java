package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calc1=new Calculator(5,3);
        System.out.println("Wyniki odejm: "+calc1.nMin);
    }

}
