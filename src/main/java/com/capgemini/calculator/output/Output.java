package com.capgemini.calculator.output;

import org.springframework.stereotype.Service;

@Service
public class Output implements OutputInterface{

    @Override
    public void showOutput(int result) {
        System.out.println("Your result is : " + result);
    }
}
