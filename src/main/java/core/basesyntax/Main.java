package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Square square = new Square("blue", 2.0);
        square.draw();
        Rectangle rectangle = new Rectangle("gray", 2.2, 4.1);
        rectangle.draw();
        RightTriangle rightTriangle = new RightTriangle("green", 3.5, 4.2);
        rightTriangle.draw();
        Circle circle = new Circle("red", 8.3);
        circle.draw();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid("yellow", 4.5, 8.2, 3.0);
        isoscelesTrapezoid.draw();
    }
}
