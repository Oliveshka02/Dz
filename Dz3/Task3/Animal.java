package Dz3.Task3;

abstract class Animal {
    protected String name;
    protected boolean isPredator;
    protected double dailyFoodAmount;

    public Animal(String name, boolean isPredator, double dailyFoodAmount) {
        this.name = name;
        this.isPredator = isPredator;
        this.dailyFoodAmount = dailyFoodAmount;
    }

    public abstract String makeSound();

    public boolean isPredator() {
        return isPredator;
    }

    public double getDailyFoodAmount() {
        return dailyFoodAmount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + (isPredator ? "хищник" : "травоядное") +
                "), корм: " + dailyFoodAmount + " кг/день";
    }
}