package homework;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceStaticProgram4
{
    int a=10;
    int b=20;
    static String name="Vishwa";
    static String lastname="Patel";

    public static void main(String[] args)
    {
        InstanceStaticProgram4 obj1=new InstanceStaticProgram4();
        obj1.myMethod(); // calling instance method with object
        newMethod(); // calling static method directly
    }

    public void myMethod()
    {
        System.out.println("Instance variable value of a: "+a);
        System.out.println("Instance variable value of b: "+b);
        System.out.println("Static variable in Instance method value of name is: "+name);
        System.out.println("Static variable in Instance method value of lastname is: "+lastname);
    }

    public static void newMethod()
    {
        InstanceStaticProgram4 obj=new InstanceStaticProgram4();
        System.out.println("Instance variable in Static method value of a: "+obj.a);
        System.out.println("Instance variable in Static method value of b: "+obj.b);
        System.out.println("Static variable value of name is: "+name);
        System.out.println("Static variable value of lastname is: "+lastname);
    }
}
