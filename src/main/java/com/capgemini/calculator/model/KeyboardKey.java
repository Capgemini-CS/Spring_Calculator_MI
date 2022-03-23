package com.capgemini.calculator.model;

import com.capgemini.calculator.exception.ExceptionWhenKeyIsInvalid;

import java.util.Scanner;

public class KeyboardKey {

    public KeyboardKey() {
    }

    public int getKeyNumber() throws ExceptionWhenKeyIsInvalid {
        int key;
        Scanner scanner = new Scanner(System.in);
        try{
            key = scanner.nextInt();
        } catch (NumberFormatException number) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return key;
    }
}
