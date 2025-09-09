//Write a program to calculate the square and cube of a number using the * operator. 

import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :" );
        int num=sc.nextInt();

        int square=num*num;
        int cube=num*num*num;

        System.out.println("The square of "+num+" is : "+square);
        System.out.println("The cube of "+num+" is : "+cube);
        sc.close();
    }
}
