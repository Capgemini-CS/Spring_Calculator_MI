package com.capgemini.calculator.demo.service.operations;


import org.springframework.stereotype.Service;

@Service
public class SumService implements ICalculate {

    @Override
    public int executeOperation(int firstNumber,String operator, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
