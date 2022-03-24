package com.capgemini.calculator.service.operation;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.exception.ExceptionWhenSecondNumberIs0;

public interface IOperation {
    int executeOperation(int firstNumber, int secondNumber) throws ExceptionWhenOperatorIsDifferent, ExceptionWhenSecondNumberIs0;
}
