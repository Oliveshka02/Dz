package Dz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] original = new int[20];

        System.out.print("Исходный массив: ");
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt(200) - 100;
            System.out.print(original[i] + " ");
        }
        System.out.println();

        List<Integer> even = new ArrayList<>();      // четные
        List<Integer> odd = new ArrayList<>();       // нечетные
        List<Integer> negative = new ArrayList<>();  // отрицательные
        List<Integer> positive = new ArrayList<>();  // положительные

        for (int num : original) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);

            if (num < 0) negative.add(num);
            else if (num > 0) positive.add(num);
        }

        int[][] result = new int[4][];
        result[0] = listToArray(even);
        result[1] = listToArray(odd);
        result[2] = listToArray(negative);
        result[3] = listToArray(positive);

        String[] names = {"Четные", "Нечетные", "Отрицательные", "Положительные"};

        for (int i = 0; i < result.length; i++) {
            System.out.print(names[i] + ": ");
            printArray(result[i]);
        }
    }

    private static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private static void printArray(int[] array) {
        if (array.length == 0) {
            System.out.println("(пусто)");
            return;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
