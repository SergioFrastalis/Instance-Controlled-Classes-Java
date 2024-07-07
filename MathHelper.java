package gr.aueb.cf.ch14.homework;

public class MathHelper {
    private MathHelper() {}

    // Method to find the average of an array
    public static double arrayAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        return (double) sum / array.length;
    }

    // Method to find the minimum value in an array
    public static int arrayMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    // Method to find the maximum value in an array
    public static int arrayMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double average = MathHelper.arrayAverage(array);
        int min = MathHelper.arrayMin(array);
        int max = MathHelper.arrayMax(array);

        System.out.println("Average of array: " + average);
        System.out.println("Min of array: " + min);
        System.out.println("Max of array: " + max);
    }
}
