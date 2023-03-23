package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_3 {

    //3.1 Declare one static and one instance variables.

    String name = "rashang";
    static String surname = "soni";

    //3.2 Declare one instance method

    public void instancemethod() {
        System.out.println(name);
        System.out.println(surname);

    }

    //3.3 Declare one static method

    public static void staticmethod() {

        //3.4 Calling instance variables
        Programme_3 intsancevariable = new Programme_3();

        System.out.println(intsancevariable.name);

        //3.4a calling static variables

        System.out.println(surname);

    }

    //3.5 Declare the main method
    public static void main(String[] args) {
       // 3.6 Call the both instance method and static method
        Programme_3 obj = new Programme_3();
        obj.instancemethod();
        staticmethod();


    }
}



