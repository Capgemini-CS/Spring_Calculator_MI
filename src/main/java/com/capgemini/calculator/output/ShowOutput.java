package com.capgemini.calculator.output;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.model.KeyboardKey;
import com.capgemini.calculator.model.Operator;
import com.capgemini.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class ShowOutput {

    private final CalculatorService calculatorService;
    private final KeyboardKey firstNumber;
    private final Operator operator;
    private final KeyboardKey secondNumber;

    public ShowOutput(CalculatorService calculatorService, KeyboardKey firstNumber, Operator operator, KeyboardKey secondNumber) {
        this.calculatorService = calculatorService;
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
    }

    public void showResultOfEquation() throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent {
        System.out.println(calculatorService.executeCalculation(firstNumber.getKeyNumber(),operator.getOperatorInput(),secondNumber.getKeyNumber()));
    }
}
