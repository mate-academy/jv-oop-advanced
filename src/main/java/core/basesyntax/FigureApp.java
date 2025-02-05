package core.basesyntax;

public class FigureApp {
    public static void main(String[] args) {
        Figure square = new Square("Red", 2.5);
        Figure trapezoid = new IsoscelesTrapezoid("Blue", 3, 2, 4.1);
        Figure circle = new Circle("Red", 2.5);
        Figure rectangle = new Rectangle("Red", 2.5, 2.5);
        square.draw();
        trapezoid.draw();
        rectangle.draw();
        circle.draw();
    }
}
