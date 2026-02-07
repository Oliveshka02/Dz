package Dz4.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TaxDatabase {
    private Map<String, Person> database = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void printAll() {
        System.out.println("\n========== ПОЛНАЯ БАЗА ДАННЫХ ==========");
        if (database.isEmpty()) {
            System.out.println("База пуста");
            return;
        }
        for (Person p : database.values()) {
            System.out.println(p);
            System.out.println("----------------------------------------");
        }
    }

    // 2. Поиск по коду
    public void printById() {
        System.out.print("Введите ID: ");
        String id = scanner.nextLine();
        Person p = database.get(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Человек не найден");
        }
    }

    // 3. Поиск по типу штрафа
    public void printByFineType() {
        System.out.print("Введите тип штрафа: ");
        String type = scanner.nextLine();

        System.out.println("\n--- Результаты поиска ---");
        boolean found = false;
        for (Person p : database.values()) {
            for (Fine f : p.getFines()) {
                if (f.getType().equalsIgnoreCase(type)) {
                    System.out.println(p.getId() + " " + p.getName());
                    System.out.println(f);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Ничего не найдено");
    }

    // 4. Поиск по городу
    public void printByCity() {
        System.out.print("Введите город: ");
        String city = scanner.nextLine();

        System.out.println("\n--- Результаты поиска ---");
        boolean found = false;
        for (Person p : database.values()) {
            for (Fine f : p.getFines()) {
                if (f.getCity().equalsIgnoreCase(city)) {
                    System.out.println(p.getId() + " " + p.getName());
                    System.out.println(f);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Ничего не найдено");
    }

    // 5. Добавление нового человека
    public void addPerson() {
        System.out.print("Введите ID: ");
        String id = scanner.nextLine();

        if (database.containsKey(id)) {
            System.out.println("Человек с таким ID уже существует!");
            return;
        }

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        database.put(id, new Person(id, name));
        System.out.println("Человек добавлен");
    }

    // 6. Добавление штрафа
    public void addFine() {
        System.out.print("Введите ID человека: ");
        String id = scanner.nextLine();

        Person p = database.get(id);
        if (p == null) {
            System.out.println("Человек не найден");
            return;
        }

        System.out.print("Тип штрафа: ");
        String type = scanner.nextLine();
        System.out.print("Сумма: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Город: ");
        String city = scanner.nextLine();
        System.out.print("Дата: ");
        String date = scanner.nextLine();

        p.addFine(new Fine(type, amount, city, date));
        System.out.println("Штраф добавлен");
    }

    // 7. Удаление штрафа
    public void removeFine() {
        System.out.print("Введите ID человека: ");
        String id = scanner.nextLine();

        Person p = database.get(id);
        if (p == null) {
            System.out.println("Человек не найден");
            return;
        }

        System.out.println(p);
        System.out.print("Введите номер штрафа для удаления: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (p.removeFine(index)) {
            System.out.println("Штраф удален");
        } else {
            System.out.println("Неверный номер");
        }
    }

    // 8. Замена информации
    public void updatePerson() {
        System.out.print("Введите ID: ");
        String id = scanner.nextLine();

        Person p = database.get(id);
        if (p == null) {
            System.out.println("Человек не найден");
            return;
        }

        System.out.println("Текущие данные:");
        System.out.println(p);

        System.out.print("Новое имя (Enter - не менять): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            p.setName(name);
        }

        System.out.println("Данные обновлены");
    }

    public void addPersonDirect(Person person) {
        database.put(person.getId(), person);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n========== МЕНЮ ==========");
            System.out.println("1. Показать всю базу");
            System.out.println("2. Поиск по ID");
            System.out.println("3. Поиск по типу штрафа");
            System.out.println("4. Поиск по городу");
            System.out.println("5. Добавить человека");
            System.out.println("6. Добавить штраф");
            System.out.println("7. Удалить штраф");
            System.out.println("8. Изменить данные");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": printAll(); break;
                case "2": printById(); break;
                case "3": printByFineType(); break;
                case "4": printByCity(); break;
                case "5": addPerson(); break;
                case "6": addFine(); break;
                case "7": removeFine(); break;
                case "8": updatePerson(); break;
                case "0": return;
                default: System.out.println("Неверный выбор");
            }
        }
    }
}
