package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme_2 {

//2.1 Declare two static variables

    static int a = 10;
    static int b = 20;


    //2.2 Decalre one static method

    public static void staticmethoded() {

        //2.3 Call the both variables in to the static method inside the print statement.

        System.out.println(a);
        System.out.println(b);
    }

    //2.4 Declare the main method.

    public static void main(String[] args) {

        // 2.5 call the static method into the main method.

        staticmethoded();

    }

}
