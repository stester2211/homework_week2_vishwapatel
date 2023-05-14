package homework;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 */

import java.util.Scanner;

public class RectangleProgram14
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args)
    {
      myMethod();
    }

    public static void myMethod()
    {
        // Calculating area and perimeter of Rectangle
        System.out.print("Enter the width of Rectangle: ");
        double width=sc.nextDouble();
        System.out.print("Enter the Height of Rectangle: ");
        double height=sc.nextDouble();

        double peri = 2*(height + width);
        double area = width * height;

        System.out.println(); // just for extra line
        System.out.println("Area of Rectangle is :" + area);
        System.out.println("Perimeter of Rectangle is :" +peri);
    }
}
