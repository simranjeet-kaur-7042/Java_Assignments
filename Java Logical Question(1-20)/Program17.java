//Take marks as input and print the grade using if-else: (90+ → A, 75–89 → B, 50–74 → C, below 50 → Fail).

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <= 74) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
        sc.close();
    }
}

