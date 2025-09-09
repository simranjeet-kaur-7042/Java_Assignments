//Write a program to calculate simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100. Take Principal, Rate, and Time as inputs from the user.


import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        double principal=sc.nextDouble();

        System.out.print("Enter the Rate : ");
        double rate = sc.nextDouble();

        System.out.println("Enter the time period(in years) : ");
        double time=sc.nextDouble();

        double simple_interest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is : "+simple_interest);

        sc.close();

    }
    
}
