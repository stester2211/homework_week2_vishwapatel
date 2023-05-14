package homework;

/**
 * Write a Java program to convert a given string into lowercase.
 */

import java.util.Scanner;

public class LowerCaseProgram19
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args)
    {
        LowerCaseProgram19 obj=new LowerCaseProgram19();
        obj.myMethod();
    }

    public void myMethod()
    {
        System.out.print("Enter upper case value: ");
        String low = sc.nextLine();
        System.out.println("Upper case converted to Lower case : "+low.toLowerCase());
    }
}
