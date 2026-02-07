package Dz3.Task1;

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}