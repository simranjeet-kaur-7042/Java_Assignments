//Rewrite the above program to print the greatest factor of a number beside itself using a while loop.

import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; 
            int i = number - 1;     
            while (i >= 1) {
                if (number % i == 0) {
                    greatestFactor = i; 
                    break;           
                }
                i--; 
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        sc.close();
    }
}
