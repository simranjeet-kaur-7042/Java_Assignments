//Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch


import java.util.Scanner;
class RocketLaunchCountdown_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println( "Launch!");
        sc.close();
    }
}
