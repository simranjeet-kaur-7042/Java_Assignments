//Write a program to take user name and age as input and print : "Hello ,you are _ years old".

import java.util.Scanner;
public class Program11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name=sc.nextLine();

        System.out.print("Please enter your age (in years) : ");
        int age =sc.nextInt();

        System.out.println("Hello "+name+", You are "+age+" years old.");
        sc.close();
    }
}
