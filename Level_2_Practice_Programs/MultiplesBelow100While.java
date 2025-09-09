//Rewrite the program to find all the multiples of a number below 100 using while loop.

import java.util.Scanner;
class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 100;
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; 
            }
        }
        sc.close();
    }
}
