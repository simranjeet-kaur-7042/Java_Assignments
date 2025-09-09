//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 


import java.util.Scanner;

class SumOfNaturalNum_while{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula    = " + sumFormula);
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("Results do not match.");
            }
        }

        sc.close();
    }
}
