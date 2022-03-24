package com.capgemini.calculator.service;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculator.exception.ExceptionWhenOperatorIsDifferent;
import com.capgemini.calculator.exception.ExceptionWhenSecondNumberIs0;
import com.capgemini.calculator.output.Output;
import com.capgemini.calculator.service.operation.AdditionService;
import com.capgemini.calculator.service.operation.DivideService;
import com.capgemini.calculator.service.operation.MultiplyService;
import com.capgemini.calculator.service.operation.SubtractService;
import com.capgemini.calculator.input.NumberInput;
import com.capgemini.calculator.input.OperatorInput;
import com.capgemini.calculator.service.validation.ValidateParametersOfEquation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    private final AdditionService additionService;
    private final SubtractService subtractService;
    private final MultiplyService multiplyService;
    private final DivideService divideService;

    private final NumberInput numberInput;
    private final OperatorInput operatorInput;

    private final Output output;

    private final ValidateParametersOfEquation validateParametersOfEquation;

    @Autowired
    public CalculatorService(AdditionService additionService, SubtractService subtractService, MultiplyService multiplyService, DivideService divideService, NumberInput numberValidation, OperatorInput operatorValidation, Output showOutput, ValidateParametersOfEquation validateParametersOfEquation) {
        this.additionService = additionService;
        this.subtractService = subtractService;
        this.multiplyService = multiplyService;
        this.divideService = divideService;
        this.numberInput = numberValidation;
        this.operatorInput = operatorValidation;
        this.output = showOutput;
        this.validateParametersOfEquation = validateParametersOfEquation;
    }

    @Override
    public void executeCalculation() throws ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent, ExceptionWhenSecondNumberIs0 {
        int result;

        int firstNumber = numberInput.inputFirstNumber();
        String operator = operatorInput.inputOperator();
        int secondNumber = numberInput.inputSecondNumber();

        int firstNumberOfEquation = validateParametersOfEquation.checkNumberOfEquation(firstNumber);
        String equationOperator = validateParametersOfEquation.checkOperatorOfEquation(operator);
        int secondNumberOfEquation = validateParametersOfEquation.checkNumberOfEquation(secondNumber);

        result = makeOperation(firstNumberOfEquation,equationOperator, secondNumberOfEquation);
        output.showOutput(result);
    }

    private int makeOperation(int firstNumber, String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent, ExceptionWhenSecondNumberIs0 {
        int result = 0;
        switch (operator) {
            case "+":
                result = additionService.executeOperation(firstNumber, secondNumber);
                break;
            case "-":
                result = subtractService.executeOperation(firstNumber, secondNumber);
                break;
            case "*":
                result = multiplyService.executeOperation(firstNumber, secondNumber);
                break;
            case "/":
                result = divideService.executeOperation(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}
