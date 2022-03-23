package com.capgemini.calculator.service;

import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.service.operation.AdditionService;
import com.capgemini.calculator.service.operation.DivideService;
import com.capgemini.calculator.service.operation.MultiplyService;
import com.capgemini.calculator.service.operation.SubtractService;
import com.capgemini.calculator.validation.IValidationOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

import java.util.Arrays;
import java.util.List;

@Service
public class CalculatorService implements CalculatorInterface, IValidationOperator {

    private final AdditionService additionService;
    private final SubtractService subtractService;
    private final MultiplyService multiplyService;
    private final DivideService divideService;

    @Autowired
    public CalculatorService(AdditionService additionService, SubtractService subtractService, MultiplyService multiplyService, DivideService divideService) {
        this.additionService = additionService;
        this.subtractService = subtractService;
        this.multiplyService = multiplyService;
        this.divideService = divideService;
    }

    @Override
    public int executeCalculation(int firstNumber, String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent {
        int result = 0;
        if (checkIfOperatorIsCorrect(operator)) {
            switch (operator) {
                case "+":
                    result = additionService.executeOperation(firstNumber, operator, secondNumber);
                    break;
                case "-":
                    result = subtractService.executeOperation(firstNumber, operator, secondNumber);
                    break;
                case "*":
                    result = multiplyService.executeOperation(firstNumber, operator, secondNumber);
                    break;
                case "/":
                    result = divideService.executeOperation(firstNumber, operator, secondNumber);
                    break;
            }
        }
        return result;
    }

    @Override
    public boolean checkIfOperatorIsCorrect(String operator) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        if (operators.stream().anyMatch(op -> op.equals(operator))) {
            return true;
        } else {
            Logger.warn("Your parameters is not correct");
            System.exit(0);
            return false;
        }
    }


}
