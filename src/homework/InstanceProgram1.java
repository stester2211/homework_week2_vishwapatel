package homework;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceProgram1
{
    int a=10;
    int b=20;

    public static void main(String[] args)
    {
        InstanceProgram1 obj1=new InstanceProgram1();
        obj1.myMethod();
    }

    public void myMethod()
    {
        InstanceProgram1 obj = new InstanceProgram1();
        System.out.println("Value 1: "+obj.a); // we can define using object
        System.out.println("Value 2: "+b); // we can print directly
    }
}
