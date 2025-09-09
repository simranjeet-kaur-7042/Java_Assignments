//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 



class SpringSeason {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;

        if ((month == 3 && day >= 20 && day <= 31) ||   
            (month == 4 && day >= 1 && day <= 30) ||  
            (month == 5 && day >= 1 && day <= 31) ||   
            (month == 6 && day >= 1 && day <= 20)) {    
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
