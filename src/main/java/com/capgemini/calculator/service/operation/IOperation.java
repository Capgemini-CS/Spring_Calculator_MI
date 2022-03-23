package com.capgemini.calculator.service.operation;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;

public interface IOperation {
    int executeOperation(int firstNumber,String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent;
}
