package homework_week_6;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_4 {

    //4.1 Declare two instance ans two static variables

    //instance variable
    String name = "Rashang";
    String surname ="Soni";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.

    public void instancemethod(){

        //4.4 Calling all four instance and static variables into both instance method.

        System.out.println(name);
        System.out.println(surname);
        System.out.println(a);
        System.out.println(b);

    }

    //4.3 Declare one static method.

    public static void staticmethod(){

        //4.4 Calling all four instance and static variables into both static method.
        System.out.println(a);
        System.out.println(b);
        Programme_4 staticvariable = new Programme_4();
        System.out.println(staticvariable.name);
        System.out.println(staticvariable.surname);

    }

    //4.5 Declare main method

    public static void main(String[] args) {

        //4.6 Call both instance and static methods into the Main method and run the programme.

        Programme_4 instancemethod = new Programme_4();
        instancemethod.instancemethod();
        staticmethod();

    }

}
