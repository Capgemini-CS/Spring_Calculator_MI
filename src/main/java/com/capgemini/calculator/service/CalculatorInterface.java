package com.capgemini.calculator.service;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;

public interface CalculatorInterface {
    int executeCalculation(int firstNumber, String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent;
}
