package homework;

/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class CaseProgram9
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        CaseProgram9 obj=new CaseProgram9();
        obj.myMethod(); // calling instant method
    }
    public void myMethod()
    {
        System.out.print("Enter upper case value: ");
        String low = sc.nextLine();
        System.out.println("Upper case converted to Lower case : "+low.toLowerCase());
    }
}
