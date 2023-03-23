package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    // Scanner declaration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entre the length of traingle :");
        int length = scanner.nextInt();
        System.out.println("Please entre the height of traingle :");
        int height = scanner.nextInt();
        areaOfTringle(length, height);
        // Scanner close
    }

    // Calculating the area of triangle with no return type with parameter method.

    public static void areaOfTringle(int length, int height){
        int area = (length * height);
        System.out.println("The area of a traingle is " + area );

    }
}