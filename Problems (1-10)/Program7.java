//Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula: Perimeter = 2 * (length + width).


import java.util.Scanner;
public class Program7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle :");
        double length=sc.nextDouble();

        System.out.print("Enter the Width of rectangle :");
        double width=sc.nextDouble();

        double perimeter=2*(length+width);
        System.out.println("The perimeter of rectangle is : "+perimeter);
        sc.close();
    }
}
