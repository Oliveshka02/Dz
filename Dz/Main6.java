package Dz;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        double[] array = {1.2, 0.5, 7.0, 2.6, 5.0};

        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        double[] result = arrangeAroundMax(array);

        System.out.print("Результат: ");
        System.out.println(Arrays.toString(result));
    }

    public static double[] arrangeAroundMax(double[] array) {
        if (array.length == 0) return array;

        double max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        double[] result = new double[array.length];
        int resultIndex = 0;

        for (int i = 0; i <= maxIndex; i++) {
            result[resultIndex++] = array[i];
        }

        for (int i = array.length - 1; i > maxIndex; i--) {
            result[resultIndex++] = array[i];
        }

        return result;
    }
}