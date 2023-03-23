package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Programme_18_PrintOperation {

    public static void main(String[] args) {
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input first number");
        int firstNumber = scanner.nextInt();
        System.out.println(" Input Second number");
        int secondNumber = scanner.nextInt();
        Programme_18_PrintOperation obj = new Programme_18_PrintOperation();
        obj.printTheOperation(firstNumber,secondNumber);
scanner.close();
    }

    //Printing the all operations
    public void printTheOperation(int a, int b) {
        System.out.println( + a + " + " + b + " = " + (a + b));
        System.out.println( + a + " - " + b + " is " + (a - b));
        System.out.println( + a + " * " + b + " is " + (a * b));
        System.out.println( + a + " / " + b + " is " + (a / b));
        System.out.println( + a + " mod " + b + " is " + (a % b));

    }
}


