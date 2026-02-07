package Dz3.Task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];

        figures[0] = new Rectangle(5, 3);
        figures[1] = new Circle(4);
        figures[2] = new RightTriangle(3, 4);
        figures[3] = new Trapezoid(3, 5, 2);

        System.out.println("=== РАСЧЕТ ПЛОЩАДЕЙ ===");
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}