//Rewrite the above program 7 to find the factors of a number using the while loop

import java.util.Scanner;
class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) { 
                    System.out.println(i);
                }
                i++; 
            }
        }
        sc.close();
    }
}
