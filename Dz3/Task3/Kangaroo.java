package Dz3.Task3;

class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name, false, 5);
    }

    @Override
    public String makeSound() {
        return "Ток-ток!";
    }
}