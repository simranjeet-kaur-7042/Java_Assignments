//Take two numbers as input and check which one is greater using the > operator. 

import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to check which is greater : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("\nYou entered: " + num1 + " and " + num2);
        if (num1>num2) {
            System.out.println("Number "+num1+") is greater than Number "+num2);
        }else {
            System.out.println("Number "+num2+" is greater than Number "+num1);
        }
        sc.close();
    }
}
