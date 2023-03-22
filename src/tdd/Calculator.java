package tdd;

public class Calculator {

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;

    }

    public double subtract(double firstNumber, double secondNumber) {
        if (firstNumber > secondNumber) return firstNumber - secondNumber;
        if (firstNumber < secondNumber) return secondNumber - firstNumber;
        return 0;
    }

    public double multiply(double firstNumber, double secondNUmber) {
        return firstNumber * secondNUmber;
    }

    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
