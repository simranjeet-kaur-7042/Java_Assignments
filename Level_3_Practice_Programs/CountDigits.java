//Create a program to count the number of digits in an integer.

import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("The number of digits in 0 is: 1");
        } else {
            int count = 0;
            int temp = Math.abs(number); 

            while (temp != 0) {
                temp = temp / 10; 
                count++;          
            }
            System.out.println("The number of digits in " + number + " is: " + count);
        }
        sc.close();
    }
}
