package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(10.1);
        square.drawFigure();

        Figure rectangle = new Rectangle(17, 10);
        rectangle.drawFigure();

        Figure rigthTriangle = new RigthTriangle(3, 4, 5);
        rigthTriangle.drawFigure();

        Figure circle = new Circle(132.3);
        circle.drawFigure();

        Figure trap = new IsoscelesTrapezoid(5, 10, 17);
        trap.drawFigure();
    }
}
