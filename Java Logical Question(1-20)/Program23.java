//Take a number and print factorial using do-while.

import java.util.Scanner;

public class Program23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;
        int i = 1;

        do {
            fact *= i;
            i++;
        } while (i <= num);

        System.out.println("Factorial of " + num + " = " + fact);
        sc.close();
    }
}

