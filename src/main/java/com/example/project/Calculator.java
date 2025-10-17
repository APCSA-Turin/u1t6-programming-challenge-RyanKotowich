package com.example.project;

public class Calculator {
    public String calcModel;

    // Constructor
    public Calculator(String calcModel) {
        this.calcModel = calcModel;
    }

    // Perform basic operations
    public double performOperation(String operand, int num1, int num2) {
        if (operand.equals("+")) {
            return (double) (num1 + num2);
        } else if (operand.equals("-")) {
            return (double) (num1 - num2);
        } else if (operand.equals("*")) {
            return (double) (num1 * num2);
        } else if (operand.equals("/")) {
            if (num2 != 0) {
                return (double) num1 / num2;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    // Check divisibility
    public boolean divisibleBy(int num1, int num2) {
        if (num2 == 0) {
            return false;
        } else if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Coordinate pair as string
    public String coordinatePair(int x, int y) {
        return "(" + x + "," + y + ")";
    }

    // Absolute value of difference
    public int absoluteValue(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else if (num2 > num1) {
            return num2 - num1;
        } else {
            return 0;
        }
    }

    // Average of two numbers
    public double average(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    // Info about calculator
    public String info() {
        return "This calculator is a model " + calcModel + " where " + calcModel +
               " should be filled in with the value stored in the calcModel instance variable.";
    }
}
