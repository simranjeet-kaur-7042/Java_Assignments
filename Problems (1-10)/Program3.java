//Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula: Fahrenheit = (Celsius * 9/5) + 32.

import java.util.Scanner;
public class Program3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celsius : ");
        double celsius=sc.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+ "°C is equal to " + fahrenheit + "°F");
        sc.close();
    }
}
