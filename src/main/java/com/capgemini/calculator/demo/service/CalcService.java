package com.capgemini.calculator.demo.service;

import com.capgemini.calculator.demo.service.operations.ICalculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CalcService implements CalculatorInterf{

//    private final SumService sumService;
//    private final SubtractionService subtractionService;
    private final List<ICalculate> operations;

    @Autowired
    public CalcService(Optional<List<ICalculate>> operations) {
        this.operations = operations.orElse(Collections.emptyList());
    }

//    public CalcService(SumService sumService, SubtractionService subtractionService) {
//        this.sumService = sumService;
//        this.subtractionService = subtractionService;
//    }


    @Override
    public int executeCalc() {
        return 0;
    }
}
