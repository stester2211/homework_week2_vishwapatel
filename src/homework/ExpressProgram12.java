package homework;

/**
 * Write a Java program to compute the specified
 * expressions and print the output. Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 */

public class ExpressProgram12
{
    public static void main(String[] args)
    {
        myMethod();
    }

    public static void myMethod()
    {
        double a = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println("Test data is (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)");
        System.out.println("Expression testing result is : "+a);
    }
}
