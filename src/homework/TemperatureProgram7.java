package homework;
/**
 * Write a program to insert any temperature value in degree
 * Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class TemperatureProgram7
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args)
    {
        TemperatureProgram7 obj=new TemperatureProgram7();
        obj.myMethod();
    }

    public void myMethod()
    {
        // Calculating Temperature in Celsius
        System.out.print("Enter Fahrenheit Value: ");
        Double fah = sc.nextDouble();
        Double temp = ((fah-32)*5)/9; // formula of Temperature Value
        System.out.println("Temperature of Celsius is = " + temp);
    }
}
