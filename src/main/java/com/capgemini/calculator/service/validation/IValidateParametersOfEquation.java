package com.capgemini.calculator.service.validation;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;

public interface IValidateParametersOfEquation {
    int checkNumberOfEquation(int number) throws ExceptionWhenKeyIsInvalid;
    String checkOperatorOfEquation(String operator);
}
