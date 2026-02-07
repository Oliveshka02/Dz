package Dz;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 2, 8, 5};

        System.out.print("Исходный массив: ");
        printArray(array);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Минимум: " + array[minIndex] + " (индекс " + minIndex + ")");
        System.out.println("Максимум: " + array[maxIndex] + " (индекс " + maxIndex + ")");

        int start = Math.min(minIndex, maxIndex) + 1;
        int end = Math.max(minIndex, maxIndex);

        for (int i = start; i < end; i++) {
            array[i] *= 2;
        }

        System.out.print("Результат: ");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
