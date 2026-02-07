package Dz3.Task3;

public class Main {
    public static void main(String[] args) {
        // Создаем зоопарк
        Zoo zoo = new Zoo(10);

        // Добавляем животных
        zoo.addAnimal(new Tiger("Шерхан"));
        zoo.addAnimal(new Rabbit("Белка"));
        zoo.addAnimal(new Wolf("Серый"));
        zoo.addAnimal(new Kangaroo("Джек"));
        zoo.addAnimal(new Tiger("Рыжик"));
        zoo.addAnimal(new Rabbit("Серый"));

        // Вывод информации
        zoo.printAllAnimals();

        System.out.println("\n=== СТАТИСТИКА ===");
        System.out.println("Количество хищников: " + zoo.countPredators());
        System.out.println("Корм для хищников: " + zoo.getPredatorFoodNeeded() + " кг/день");
        System.out.println("Корм для травоядных: " + zoo.getHerbivoreFoodNeeded() + " кг/день");
        System.out.println("Общий корм: " + zoo.getTotalFoodNeeded() + " кг/день");
    }
}
