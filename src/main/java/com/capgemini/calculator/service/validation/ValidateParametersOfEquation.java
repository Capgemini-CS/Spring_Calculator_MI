package com.capgemini.calculator.service.validation;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;
import org.springframework.stereotype.Service;

@Service
public class ValidateParametersOfEquation implements IValidateParametersOfEquation{

    @Override
    public int checkNumberOfEquation(int number) throws ExceptionWhenKeyIsInvalid {
        if(number <0){
            throw new ExceptionWhenKeyIsInvalid("Your number must be greater than 0");
        }
        return number;
    }

    @Override
    public String checkOperatorOfEquation(String operator) {
        String eqOperator = "";
        if(!eqOperator.equals(operator)){
            eqOperator = operator;
        }
        return eqOperator;
    }
}
