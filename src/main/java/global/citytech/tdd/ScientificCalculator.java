package global.citytech.tdd;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        String optionSelected;
        double firstNumber;
        double secondNumber;

        loop:
        do {
            System.out.println("Select operations:");
            System.out.println("1 - Add : a + b");
            System.out.println("2 - Subtract : a - b");
            System.out.println("3 - Multiply : a + b");
            System.out.println("4 - Divide : a + b");
            System.out.println("5 - Square : a ^ 2");
            System.out.println("6 - Cube : a ^ 3");
            System.out.println("7 - Power : a ^ b");
            System.out.println("8 - Square Root : square root(a)");
            System.out.println("9 - Cube Root : cube root(a)");
            System.out.println("10 - Sin : sin(a)");
            System.out.println("11 - Cos : cos(a)");
            System.out.println("12 - Tan : tan(a)");
            System.out.println("13 - Ln : log e (a)");
            System.out.println("14 - Log : log 10 (a)");
            System.out.println("15 - Exit ");

            optionSelected = sc.next();

            switch (optionSelected) {
                case "1":
                    System.out.println("");
                    System.out.println("Enter 2 numbers for a and b :");
                    firstNumber = sc.nextDouble();
                    secondNumber = sc.nextDouble();
                    cal.addNumbers(firstNumber, secondNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "2":
                    System.out.println("");
                    System.out.println("Enter 2 numbers for a and b :");
                    firstNumber = sc.nextDouble();
                    secondNumber = sc.nextDouble();
                    cal.subtractNumbers(firstNumber, secondNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "3":
                    System.out.println("");
                    System.out.println("Enter 2 numbers for a and b :");
                    firstNumber = sc.nextDouble();
                    secondNumber = sc.nextDouble();
                    cal.multiplyNumbers(firstNumber, secondNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "4":
                    System.out.println("");
                    System.out.println("Enter 2 numbers for a and b :");
                    firstNumber = sc.nextDouble();
                    secondNumber = sc.nextDouble();
                    try {
                        cal.divideNumbers(firstNumber, secondNumber);
                        System.out.println("Result = " + cal.getResult());
                        cal.cleanResult();
                    } catch (IllegalArgumentException err) {
                        System.out.println(err.getMessage());
                        System.out.println("");
                    }
                    break;
                case "5":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    cal.powerNumber(firstNumber, 2);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "6":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    cal.powerNumber(firstNumber, 3);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "7":
                    System.out.println("");
                    System.out.println("Enter 2 numbers for a and b :");
                    firstNumber = sc.nextDouble();
                    secondNumber = sc.nextDouble();
                    cal.powerNumber(firstNumber, secondNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "8":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    try {
                        cal.squareRoot(firstNumber);
                        System.out.println("Result = " + cal.getResult());
                        cal.cleanResult();
                    } catch (IllegalArgumentException err) {
                        System.out.println(err.getMessage());
                        System.out.println("");
                    }
                    cal.cleanResult();
                    break;
                case "9":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    cal.cubeRoot(firstNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "10":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    cal.sinNumber(firstNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "11":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    cal.cosNumber(firstNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "12":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    cal.tanNumber(firstNumber);
                    System.out.println("Result = " + cal.getResult());
                    cal.cleanResult();
                    break;
                case "13":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    try {
                        cal.lnNumber(firstNumber);
                        System.out.println("Result = " + cal.getResult());
                        cal.cleanResult();
                    } catch (IllegalArgumentException err) {
                        System.out.println(err.getMessage());
                        System.out.println("");
                    }
                    break;
                case "14":
                    System.out.println("");
                    System.out.println("Enter 1 numbers for a :");
                    firstNumber = sc.nextDouble();
                    try {
                        cal.logNumber(firstNumber);
                        System.out.println("Result = " + cal.getResult());
                        cal.cleanResult();
                    } catch (IllegalArgumentException err) {
                        System.out.println(err.getMessage());
                        System.out.println("");
                    }
                    break;
                case "15":
                    System.out.println("");
                    System.out.println("Exiting!");
                    break loop;
                default:
                    System.out.println("Invalid enter data!");
                    break;
            }
            System.out.println("");
        } while (true);
    }
}
