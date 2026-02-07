package Dz;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"Кофе", "Чай", "Круассан", "Торт", "Сок"};
        double[] prices = {25.0, 15.0, 30.0, 45.0, 20.0};

        while (true) {
            System.out.println("\n=== НОВАЯ КОМПАНИЯ ===");

            System.out.print("Сколько человек в компании? ");
            int peopleCount = scanner.nextInt();

            if (peopleCount <= 0) {
                System.out.println("Завершение работы.");
                break;
            }

            double totalOrder = 0;

            for (int person = 1; person <= peopleCount; person++) {
                System.out.println("\n--- Клиент " + person + " ---");
                double personTotal = 0;

                boolean ordering = true;
                while (ordering) {
                    System.out.println("Меню:");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println((i + 1) + ". " + items[i] + " - " + prices[i] + " грн");
                    }

                    System.out.print("Выберите номер (0 - завершить заказ): ");
                    int choice = scanner.nextInt();

                    if (choice == 0) {
                        ordering = false;
                    } else if (choice >= 1 && choice <= items.length) {
                        personTotal += prices[choice - 1];
                        System.out.println("Добавлено: " + items[choice - 1]);
                    } else {
                        System.out.println("Неверный выбор!");
                    }
                }

                System.out.println("Сумма клиента " + person + ": " + personTotal + " грн");
                totalOrder += personTotal;
            }

            System.out.println("\n*** ИТОГО КОМПАНИИ: " + totalOrder + " грн ***");
        }

        scanner.close();
    }
}
