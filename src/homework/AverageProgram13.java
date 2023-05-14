package homework;

/**
 * Write a Java program that takes three numbers as
 * input to calculate and print the average of the numbers.
 */

import java.util.Scanner;
public class AverageProgram13
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        AverageProgram13 obj=new AverageProgram13();
        obj.myMethod();
    }

    public void myMethod()
    {
        System.out.print("Input the first number: ");
        double a = sc.nextDouble();
        System.out.print("Input the second number: ");
        double b = sc.nextDouble();
        System.out.print("Input the third number: ");
        double c = sc.nextDouble();
        double avg= (a+b+c)/3;
        System.out.print("The average value is " + avg);
    }
}
