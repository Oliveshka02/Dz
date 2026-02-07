package Dz3.Task3;

class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name, false, 0.5);
    }

    @Override
    public String makeSound() {
        return "Пи-пи-пи!";
    }
}
