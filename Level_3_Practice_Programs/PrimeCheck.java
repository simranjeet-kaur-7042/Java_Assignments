//Write a Program to check if the given number is a prime number or not

import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true; 

        if (number <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break;          
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
        sc.close();
    }
}
