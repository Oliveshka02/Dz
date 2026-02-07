package Dz;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите объем бака (литров): ");
        int tankCapacity = scanner.nextInt();

        System.out.print("Введите расстояние А→В (км): ");
        int distanceAB = scanner.nextInt();

        System.out.print("Введите расстояние В→С (км): ");
        int distanceBC = scanner.nextInt();

        System.out.print("Введите вес груза (кг): ");
        int weight = scanner.nextInt();

        int consumption = getFuelConsumption(weight);

        if (consumption == -1) {
            System.out.println("Ошибка: самолет не поднимает груз более 2000 кг!");
            return;
        }

        int fuelNeededAB = distanceAB * consumption;
        int fuelNeededBC = distanceBC * consumption;

        if (fuelNeededAB > tankCapacity) {
            System.out.println("Невозможно долететь из А в В: недостаточно топлива!");
            return;
        }

        if (fuelNeededBC > tankCapacity) {
            System.out.println("Невозможно долететь из В в С: недостаточно топлива даже с дозаправкой!");
            return;
        }

        int fuelRemainingAtB = tankCapacity - fuelNeededAB;
        int refuelNeededAtB = fuelNeededBC - fuelRemainingAtB;

        if (refuelNeededAtB < 0) {
            refuelNeededAtB = 0;
        }

        System.out.println("\n--- РЕЗУЛЬТАТ ---");
        System.out.println("Расход: " + consumption + " л/км");
        System.out.println("Топливо на А→В: " + fuelNeededAB + " л");
        System.out.println("Топливо на В→С: " + fuelNeededBC + " л");
        System.out.println("Остаток в В: " + fuelRemainingAtB + " л");
        System.out.println("Необходима дозаправка в В: " + refuelNeededAtB + " л");

        scanner.close();
    }

    private static int getFuelConsumption(int weight) {
        if (weight <= 500) return 1;
        if (weight <= 1000) return 4;
        if (weight <= 1500) return 7;
        if (weight <= 2000) return 9;
        return -1;
    }
}