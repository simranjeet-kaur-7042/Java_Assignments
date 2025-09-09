//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement


import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 or negative to stop): ");
        double total = 0.0;  
        while (true) {
            double number = sc.nextDouble();

            if (number <= 0) {
                break; 
            }
            total += number;
        }
        System.out.println("Total sum = " + total);
        sc.close();
    }
}
