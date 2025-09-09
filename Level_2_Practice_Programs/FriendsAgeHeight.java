//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;
class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = sc.nextDouble();

        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngest;
        if (minAge == amarAge) {
            youngest = "Amar";
        } else if (minAge == akbarAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        
        double maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallest;
        if (maxHeight == amarHeight) {
            tallest = "Amar";
        } else if (maxHeight == akbarHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        
        System.out.println("The youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");

        sc.close();
    }
}
