//Create a program to find the bonus of employees based on their years of service.

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05; 
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus (service less than or equal to 5 years).");
        }
        sc.close();
    }
}

