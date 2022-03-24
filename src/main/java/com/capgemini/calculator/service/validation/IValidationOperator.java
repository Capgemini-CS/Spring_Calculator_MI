package com.capgemini.calculator.service.validation;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;

public interface IValidationOperator {
    String inputOperator() throws ExceptionWhenOperatorIsDifferent;
}