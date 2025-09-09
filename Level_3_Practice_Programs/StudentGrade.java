//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines.
//Hint => Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\n--- Student Report ---");
        System.out.println("Physics Marks   : " + physics);
        System.out.println("Chemistry Marks : " + chemistry);
        System.out.println("Maths Marks     : " + maths);
        System.out.println("Average Marks   : " + average);
        System.out.println("Grade           : " + grade);
        System.out.println("Remarks         : " + remarks);
        sc.close();
    }
}

