package com.capgemini.calculator;

import com.capgemini.calculator.output.Output;
import com.capgemini.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCalculatorApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringCalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CalculatorService calculatorService = context.getBean(CalculatorService.class);
		calculatorService.executeCalculation();
	}
}
