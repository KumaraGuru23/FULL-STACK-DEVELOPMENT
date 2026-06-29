package chapter3;

public class PrintPositiveNumbers {
    public static void main(String[] args) {
        // Example integer array
        int[] numbers = {-10, 25, -3, 0, 42, -7, 18};

        System.out.println("Positive numbers in the array:");

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {   // Check if number is positive
                System.out.println(numbers[i]);
            }
        }
    }
}
