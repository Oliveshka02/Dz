package Dz4.Task2;

public class Main {
    public static void main(String[] args) {
        TaxDatabase db = new TaxDatabase();

        // Демо-данные
        Person p1 = new Person("1234567890", "Иванов Иван");
        p1.addFine(new Fine("Превышение скорости", 500, "Киев", "2024-01-15"));
        p1.addFine(new Fine("Парковка", 300, "Киев", "2024-02-20"));

        Person p2 = new Person("0987654321", "Петров Петр");
        p2.addFine(new Fine("Проезд на красный", 1000, "Львов", "2024-03-10"));

        db.addPersonDirect(p1);
        db.addPersonDirect(p2);

        System.out.println("Демо-данные загружены!\n");

        db.showMenu();
    }
}