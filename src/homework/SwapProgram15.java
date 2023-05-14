package homework;

/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class SwapProgram15
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        SwapProgram15 obj=new SwapProgram15();
        obj.myMethod();
    }

    public void myMethod()
    {
        System.out.print("Input the first number: ");
        int x = sc.nextInt();
        System.out.print("Input the second number: ");
        int y = sc.nextInt();
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("Swapped values of first value and second value:" + x + " and " +y);
    }
}
