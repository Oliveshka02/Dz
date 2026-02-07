package Dz;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначное число: ");
        String input = scanner.nextLine();

        if (input.length() != 6 || !input.matches("\\d+")) {
            System.out.println("Ошибка: введите шестизначное число!");
            return;
        }

        char[] digits = input.toCharArray();

        char temp;

        temp = digits[0];
        digits[0] = digits[5];
        digits[5] = temp;

        temp = digits[1];
        digits[1] = digits[4];
        digits[4] = temp;

        String result = new String(digits);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
