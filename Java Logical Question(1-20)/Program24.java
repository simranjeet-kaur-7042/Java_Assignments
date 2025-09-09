//Store an array of 5 integers and print them using a for-each loop.


public class Program24{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

