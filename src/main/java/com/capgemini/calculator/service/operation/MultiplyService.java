package com.capgemini.calculator.service.operation;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService implements IOperation{
    @Override
    public int executeOperation(int firstNumber,String operator, int secondNumber){
        return firstNumber * secondNumber;
    }
}
