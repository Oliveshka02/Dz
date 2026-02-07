package Dz3.Task1;

class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(double leg1, double leg2) {
        super("Прямоугольный треугольник");
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double calculateArea() {
        return 0.5 * leg1 * leg2;
    }
}
