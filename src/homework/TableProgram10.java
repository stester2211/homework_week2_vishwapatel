package homework;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
 */

import java.util.Scanner;
public class TableProgram10
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        myMethod();
    }
    public static void myMethod()
    {
        // Print any number table upto 10
        System.out.print("Input a number: ");
        int num1 = sc.nextInt();
        for (int i=0; i< 10; i++)
        {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }

}
