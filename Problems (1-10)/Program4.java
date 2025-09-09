//Write a program to calculate the area of a circle. Take the radius as input and use the formula:

import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius= sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.err.println("The Area of circle is : "+area);
        sc.close();
    } 
}
