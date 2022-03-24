package com.capgemini.calculator.input;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.service.validation.IValidationOperator;
import com.capgemini.calculator.service.validation.OperatorValidate;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class OperatorInput implements IValidationOperator {

    @Override
    public String inputOperator() throws ExceptionWhenOperatorIsDifferent {
        String operator;
        Scanner scanner = new Scanner(System.in);
        operator = scanner.nextLine();
        if(!OperatorValidate.checkIfOperatorIsCorrect(operator)){
            throw new ExceptionWhenOperatorIsDifferent("Your operator is not correct.");
        }
        return operator;
    }
}
