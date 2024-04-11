import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};


        for (int num : integerArray) {
            System.out.println(num);
        }


        for (int num : integerArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
