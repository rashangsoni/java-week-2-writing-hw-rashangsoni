package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
*/
public class Programme_7_TempConversion {

// Scanner declaration for user input

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert any temperature in fahrenhieit :");

        float temp = scanner.nextFloat();
        Programme_7_TempConversion obj = new Programme_7_TempConversion();
        obj.convertTempToDegreeCelcius(temp);
                scanner.close();
    }
    //Temperature conversation method
    public void convertTempToDegreeCelcius(float temp) {
        float c = (( temp -32) * 5/9);

        System.out.println( " The temperature "  + temp + " fahreenheit is equal to " + c + "degree celsius");
    }
}
