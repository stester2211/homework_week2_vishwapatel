package homework;

/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class TriangleProgram8
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        myMethod(); // calling static method
    }

    public static void myMethod()
    {
        // Calculating the area of triangle
        System.out.print("Enter the width of the Triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the Triangle: ");
        double height = sc.nextDouble();

        double area = (base* height)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}
