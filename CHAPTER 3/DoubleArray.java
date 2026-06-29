package chapter3;

public class DoubleArray
{
    public static void main(String[] args) {
        
        double[] numbers = {10.5, 20.3, 30.7, 40.2, 50.0};

        double sum = 0;

        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        
        double average = sum / numbers.length;

       
        System.out.println("Average of array elements: " + average);
    }
}

