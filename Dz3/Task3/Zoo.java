package Dz3.Task3;

class Zoo {
    private Animal[] animals;
    private int count;

    public Zoo(int capacity) {
        animals = new Animal[capacity];
        count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }

    // Количество хищников
    public int countPredators() {
        int predators = 0;
        for (int i = 0; i < count; i++) {
            if (animals[i].isPredator()) {
                predators++;
            }
        }
        return predators;
    }

    // Объем корма для хищников
    public double getPredatorFoodNeeded() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (animals[i].isPredator()) {
                total += animals[i].getDailyFoodAmount();
            }
        }
        return total;
    }

    // Объем корма для травоядных
    public double getHerbivoreFoodNeeded() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (!animals[i].isPredator()) {
                total += animals[i].getDailyFoodAmount();
            }
        }
        return total;
    }

    // Общий объем корма
    public double getTotalFoodNeeded() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += animals[i].getDailyFoodAmount();
        }
        return total;
    }

    public void printAllAnimals() {
        System.out.println("=== ЖИВОТНЫЕ В ЗООПАРКЕ ===");
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i] + " | Звук: " + animals[i].makeSound());
        }
    }
}
