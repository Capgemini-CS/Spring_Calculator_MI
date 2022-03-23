package com.capgemini.calculator.service.operation;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.validation.IValidationNumber;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class DivideService implements IOperation, IValidationNumber {

    @Override
    public int executeOperation(int firstNumber, String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent {
        if(checkValidationNumber(secondNumber)){
            Logger.warn("You can use only : /");
            throw new ExceptionWhenOperatorIsDifferent("You can use only : /");
        }
        return firstNumber / secondNumber;
    }

    @Override
    public boolean checkValidationNumber(int number) {
        Logger.error("Something went wrong");
        return number == 0;
    }
}
