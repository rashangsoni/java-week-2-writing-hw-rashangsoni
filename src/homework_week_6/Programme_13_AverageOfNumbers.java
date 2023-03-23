package homework_week_6;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    //Scanner declaration for reading input form console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the first number");
        double x = scanner.nextDouble();
        System.out.println(" Enter the second number");
        double y = scanner.nextDouble();
        System.out.println(" Enter the Third number");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        scanner.close();
    }

    // Calculation the average of three numbers
    public static void averageOfThreeNumbers(double x, double y, double z) {
        double average = (x + y + z) / 3;
        System.out.println("The average of " + x + " , " + y + " and " + z + " is " + average);


    }
}