//Write a program that takes two numbers as input from the user and prints their sum.

import java.util.Scanner;
public class Program2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter Second Number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of " + num1 + " and " + num2 + " is : " + sum);
        sc.close();
    }
}
