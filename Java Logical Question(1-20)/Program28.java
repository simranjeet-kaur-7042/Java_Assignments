//Take a string input and print characters one by one, but stop when a space is found.

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                break;
            }
            System.out.println(ch);
        }
        sc.close();
    }
}

