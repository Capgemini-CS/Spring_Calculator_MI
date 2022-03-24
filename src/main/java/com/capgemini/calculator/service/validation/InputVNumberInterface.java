package com.capgemini.calculator.service.validation;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;

public interface InputVNumberInterface {
    int inputFirstNumber() throws ExceptionWhenKeyIsInvalid;
    int inputSecondNumber() throws  ExceptionWhenKeyIsInvalid;
}
