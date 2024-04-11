import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }


        System.out.println("Sum of even numbers: " + sumEven(numbers));


        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        printWordsWithLength(numbers, numChars);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                total += num;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<Integer> arr, int length) {
        System.out.println("Words with " + length + " letters:");
        for (int num : arr) {
            if (String.valueOf(num).length() == length) {
                System.out.println(num);
            }
        }
    }
}
