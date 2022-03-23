package com.capgemini.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService implements IOperation{

    @Override
    public int executeOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
