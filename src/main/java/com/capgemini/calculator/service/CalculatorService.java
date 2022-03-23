package com.capgemini.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface{

    private final AdditionService additionService;
    private final SubtractService subtractService;

    public CalculatorService(AdditionService additionService, SubtractService subtractService ) {
        this.additionService = additionService;
        this.subtractService = subtractService;
    }

    @Override
    public void executeCalculation() {
        System.out.println(additionService.executeOperation(8,2));
        System.out.println(subtractService.executeOperation(6,3));
    }
}
