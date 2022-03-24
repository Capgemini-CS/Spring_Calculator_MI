package com.capgemini.calculator.input;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;
import com.capgemini.calculator.service.validation.InputVNumberInterface;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class NumberInput implements InputVNumberInterface {

    @Override
    public int inputFirstNumber() throws ExceptionWhenKeyIsInvalid {
        int number;
        Scanner scanner = new Scanner(System.in);
        try{
            number = scanner.nextInt();
        } catch (NumberFormatException numberFormatException) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return number;
    }

    @Override
    public int inputSecondNumber() throws ExceptionWhenKeyIsInvalid {
        int number;
        Scanner scanner = new Scanner(System.in);
        try{
            number = scanner.nextInt();
        } catch (NumberFormatException numberFormatException) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return number;
    }
}