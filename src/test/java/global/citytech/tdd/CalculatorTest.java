package global.citytech.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    static class Calculator {
        private double result;

        public void initialTesting() {
            throw new IllegalArgumentException("Initial Test Confirmed!");
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
            if(secondNumber == 0){
                throw new IllegalArgumentException("Cannot be divided by Zero! Its infinity.");
            }else{
                result = firstNumber / secondNumber;
            }
        }
    }

    //    delta - the maximum delta between expected and actual for which both numbers are still considered equal.
    private static final double DELTA = 1e-15;

    @Test
    public void doGetResultTesting() {
        Calculator c = new Calculator();
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void doInitialTesting() {
        Calculator c = new Calculator();
        c.initialTesting();
    }

    @Test
    public void add_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(22, 11);
        double receivedResult = c.getResult();
        assertEquals(33, receivedResult, DELTA);
    }

    @Test
    public void add_Zeros_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(0, 0);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void add_FirstNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(-22, 11);
        double receivedResult = c.getResult();
        assertEquals(-11, receivedResult, DELTA);
    }

    @Test
    public void add_SecondNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(22, -11);
        double receivedResult = c.getResult();
        assertEquals(11, receivedResult, DELTA);
    }

    @Test
    public void subtract_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(22, 11);
        double receivedResult = c.getResult();
        assertEquals(11, receivedResult, DELTA);
    }

    @Test
    public void subtract_SecondNumber_Greater_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(22, 33);
        double receivedResult = c.getResult();
        assertEquals(-11, receivedResult, DELTA);
    }

    @Test
    public void subtract_SecondNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(22, -33);
        double receivedResult = c.getResult();
        assertEquals(55, receivedResult, DELTA);
    }

    @Test
    public void subtract_FirstNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(-22, 33);
        double receivedResult = c.getResult();
        assertEquals(-55, receivedResult, DELTA);
    }

    @Test
    public void subtract_BothNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(-22, -33);
        double receivedResult = c.getResult();
        assertEquals(11, receivedResult, DELTA);
    }

    @Test
    public void multiply_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(2, 3);
        double receivedResult = c.getResult();
        assertEquals(6, receivedResult, DELTA);
    }

    @Test
    public void multiply_FirstNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(-2, 3);
        double receivedResult = c.getResult();
        assertEquals(-6, receivedResult, DELTA);
    }

    @Test
    public void multiply_SecondNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(2, -3);
        double receivedResult = c.getResult();
        assertEquals(-6, receivedResult, DELTA);
    }

    @Test
    public void multiply_BothNumbers_Negative_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(-2, -3);
        double receivedResult = c.getResult();
        assertEquals(6, receivedResult, DELTA);
    }

    @Test
    public void multiply_With_Zero_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(0, -3);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void multiply_Both_Zeros_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(0, 0);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void divide_Testing() {
        Calculator c = new Calculator();
        c.divideNumbers(10, 3);
        double receivedResult = c.getResult();
        assertEquals(3.3333333333333335, receivedResult, DELTA);
    }

    @Test
    public void divide_FirstNumber_Zero_Testing() {
        Calculator c = new Calculator();
        c.divideNumbers(0, 3);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_SecondNumber_Zero_Testing() {
        Calculator c = new Calculator();
        try{
            c.divideNumbers(10, 0);
        }catch(IllegalArgumentException err){
            String message = "Cannot be divided by Zero! Its infinity.";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_Both_Zero_Testing() {
        Calculator c = new Calculator();
        try{
            c.divideNumbers(0, 0);
        }catch(IllegalArgumentException err){
            String message = "Cannot be divided by Zero! Its infinity.";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }
}
