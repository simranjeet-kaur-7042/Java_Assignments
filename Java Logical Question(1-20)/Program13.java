//Take a number as input and print whether it is even or odd. 


import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check whether it is ODD/EVEN : ");
        int check=sc.nextInt();

        System.out.println("\nThe number you entered is : "+ check);
        if(check%2==0){
            System.out.println(check+" is an EVEN number.");
        }else{
            System.out.println(check+" is an ODD number.");
        }
        sc.close();
    }
    
}
