package com.capgemini.calculator.model;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Operator {

    public Operator() {
    }

    public String getOperatorInput() {
        String operator;
        Scanner scanner = new Scanner(System.in);
        operator = scanner.nextLine();
        return operator;
    }
}
