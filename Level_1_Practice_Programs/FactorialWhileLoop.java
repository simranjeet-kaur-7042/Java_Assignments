//Write a Program to find the factorial of an integer entered by the user. Using a while loop, compute the factorial.



import java.util.Scanner;

class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int i = 1;
            long factorial = 1; 
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " = " + factorial);
        }
        sc.close();
    }
}
