package homework;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceStaticProgram3
{
    int a=10;
    static char name='v';

    public static void main(String[] args)
    {
        InstanceStaticProgram3 obj1=new InstanceStaticProgram3();
        obj1.myMethod(); // calling instance method with object
        staticMethod(); // calling static method directly
    }

    public void myMethod()
    {
        System.out.println("Instance method Value of a: "+a);
        System.out.println("Instance method static variable value of name: "+name);
    }

    public static void staticMethod()
    {
        InstanceStaticProgram3 obj=new InstanceStaticProgram3();
        System.out.println("Static method instance variable value of a: "+obj.a); // calling instance variable
        System.out.println("Static method Value of name: "+name);
    }
}
