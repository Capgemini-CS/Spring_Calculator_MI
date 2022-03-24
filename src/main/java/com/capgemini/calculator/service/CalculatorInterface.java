package com.capgemini.calculator.service;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.exception.ExceptionWhenSecondNumberIs0;

public interface CalculatorInterface {
    void executeCalculation() throws ExceptionWhenOperatorIsDifferent, ExceptionWhenKeyIsInvalid, ExceptionWhenSecondNumberIs0;
}
