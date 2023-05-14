package homework;

/**
 * Write a Java program to print the sum (addition),
 * multiply, subtract, divide and remainder of two numbers.
 */

import java.util.Scanner;

public class CalculationProgram18
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        myMethod();
    }

    public static void myMethod()
    {
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));
    }
}
