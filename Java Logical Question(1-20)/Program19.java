//Take a character input and check whether it is a vowel or consonant using switch.

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); 

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a Consonant");
                } else {
                    System.out.println("Invalid input! Please enter an alphabet.");
                }
        }
        sc.close();
    }
}
