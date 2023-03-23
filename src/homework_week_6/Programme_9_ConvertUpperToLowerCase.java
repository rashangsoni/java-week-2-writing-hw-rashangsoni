package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {

        // Scanner declared
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the uppercase string :");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertTheUpperCaseToLowerCase(uppercase);
// Scanner closed
scanner.close();
    }

    public void convertTheUpperCaseToLowerCase(String uppercase){
        System.out.println("The lower case value is :" + uppercase.toLowerCase() );
    }
}
