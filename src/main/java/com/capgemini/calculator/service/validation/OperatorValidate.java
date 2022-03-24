package com.capgemini.calculator.service.validation;

import org.tinylog.Logger;

import java.util.Arrays;
import java.util.List;

public class OperatorValidate {

    public static boolean checkIfOperatorIsCorrect(String operator){
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        if (operators.stream().anyMatch(op -> op.equals(operator))) {
            return true;
        } else {
            Logger.warn("Your parameters is not correct");
            System.exit(0);
        }
        return true;
    }
}
