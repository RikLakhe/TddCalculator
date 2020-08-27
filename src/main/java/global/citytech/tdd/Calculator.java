package global.citytech.tdd;

public class Calculator {
    private double result;

    public void initialTesting() {
        throw new IllegalArgumentException("Initial Test Confirmed!");
    }

    public void cleanResult() {
        this.result = 0.0;
    }

    public double getResult() {
        return result;
    }

    public void addNumbers(double firstNumber, double secondNumber) {
        result = firstNumber + secondNumber;
    }

    public void subtractNumbers(double firstNumber, double secondNumber) {
        result = firstNumber - secondNumber;
    }

    public void multiplyNumbers(double firstNumber, double secondNumber) {
        result = firstNumber * secondNumber;
    }

    public void divideNumbers(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot be divided by Zero! Its infinity.");
        } else {
            result = firstNumber / secondNumber;
        }
    }

    public void powerNumber(double firstNumber, double secondNumber) {
        result = Math.pow(firstNumber, secondNumber);
    }

    public void squareRoot(double firstNumber) {
        if (firstNumber < 0) {
            throw new IllegalArgumentException("Square root of negative number is irrational number.");
        } else {
            result = Math.sqrt(firstNumber);
        }
    }

    public void cubeRoot(double firstNumber) {
        result = Math.cbrt(firstNumber);
    }

    public void sinNumber(double firstNumber) {
        result = Math.sin(firstNumber);
    }

    public void cosNumber(double firstNumber) {
        result = Math.cos(firstNumber);
    }

    public void tanNumber(double firstNumber) {
        result = Math.tan(firstNumber);
    }

    //        Logarithm of a number base e
    public void lnNumber(double firstNumber) {
        if (firstNumber == 0) {
            throw new IllegalArgumentException("Cannot be zero! Its Infinity!");
        } else if (firstNumber < 0) {
            throw new IllegalArgumentException("Cannot be negative!");
        } else {
            result = Math.log(firstNumber);
        }
    }

    //        Logarithm of a number base 10
    public void logNumber(double firstNumber) {
        if (firstNumber == 0) {
            throw new IllegalArgumentException("Cannot be zero! Its Infinity!");
        } else if (firstNumber < 0) {
            throw new IllegalArgumentException("Cannot be negative!");
        } else {
            result = Math.log10(firstNumber);
        }
    }
}
