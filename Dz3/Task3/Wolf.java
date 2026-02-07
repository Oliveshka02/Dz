package Dz3.Task3;

class Wolf extends Animal {
    public Wolf(String name) {
        super(name, true, 8);
    }

    @Override
    public String makeSound() {
        return "Ауууу!";
    }
}
