package com.capgemini.calculator.service;

import org.springframework.stereotype.Service;

public interface IOperation {
    int executeOperation(int firstNumber, int secondNumber);
}
