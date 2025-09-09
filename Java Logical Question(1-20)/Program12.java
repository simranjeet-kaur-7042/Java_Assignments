//Take two numbers as input and print their sum,difference,product and quotient.

import java.util.Scanner;
public class Program12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        double num2=sc.nextDouble();

        System.out.println("=====ARITHMETIC OPERATIONS=====");
        double sum=num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is :"+sum);

        double difference=num1-num2;
        System.out.println("Difference of "+num1+" and "+num2+" is :"+ difference);

        double product=num1*num2;
        System.out.println("Product of "+num1+" and "+num2+" is :"+ product);

        double quotient=num1/num2;
        System.err.println("Quotient of "+num1+" and "+num2+" is :"+ quotient);
        sc.close();
    }
    
}
