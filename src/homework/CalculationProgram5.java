package homework;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */


import java.util.Scanner;

public class CalculationProgram5
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        addition();
        subtraction();
        CalculationProgram5 obj=new CalculationProgram5();
        obj.division();
        obj.multiplication();
    }
    public static void addition()
    {

        System.out.println("Addition of two number");
        System.out.print("Enter Value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Value 2: ");
        int b=  sc.nextInt();
        int result=a+b;
        System.out.println("Addition of " +a+ " and " +b+ " is " +result);
    }
    public static void subtraction()
    {
        System.out.println(); // just for extra line
        System.out.println("Subtraction of two Value");
        System.out.print("Enter Value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Value 2: ");
        int b=  sc.nextInt();
        int result=a-b;
        System.out.println("Subtraction of " +a+ " and " +b+ " is " +result);
    }
    public void multiplication()
    {
        System.out.println(); // just for extra line
        System.out.println("Multiplication of two value");
        System.out.print("Enter Value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Value 2: ");
        int b=  sc.nextInt();
        int result=a*b;
        System.out.println("Multiplication of " +a+ " and " +b+ " is " +result);
    }
    public void division()
    {
        System.out.println(); // just for extra line
        System.out.println("Division of two value");
        System.out.print("Enter Value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Value 2: ");
        int b=  sc.nextInt();
        int result=a/b;
        System.out.println("Division of " +a+ " and " +b+ " is " +result);
    }
}
