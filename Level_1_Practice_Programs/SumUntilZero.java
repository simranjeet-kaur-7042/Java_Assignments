//Write a program to find the sum of numbers until the user enters 0


import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   
        double number;       

        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        while (number != 0.0) {
            total += number; 
            number = sc.nextDouble(); 
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}
