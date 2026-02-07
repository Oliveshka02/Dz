package Dz3.Task1;

abstract class Figure {
    protected String name;

    public Figure(String name) {
        this.name = name;
    }

    // Абстрактный метод для расчета площади
    public abstract double calculateArea();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", площадь: " + calculateArea();
    }
}
