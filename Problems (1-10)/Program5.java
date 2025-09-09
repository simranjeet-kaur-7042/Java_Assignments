//Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula: Volume = π * radius^2 * height.

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius=sc.nextDouble();
        
        System.out.print("Enter the height of circle : ");
        double height=sc.nextDouble();

        double Vol=Math.PI*radius*radius*height;
        System.out.println("The Volume of a Cylinder is : "+Vol);
        sc.close();
    }
    
    
}
