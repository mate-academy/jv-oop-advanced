package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Behaviour square = new Square(10.1);
        square.drawFigure();

        Behaviour rectangle = new Rectangle(17, 10);
        rectangle.drawFigure();

        Behaviour rigthTriangle = new RigthTriangle(3, 4, 5);
        rigthTriangle.drawFigure();

        Behaviour circle = new Circle(132.3);
        circle.drawFigure();

        Behaviour trap = new IsoscelesTrapezoid(5, 10, 17);
        trap.drawFigure();
    }
}
