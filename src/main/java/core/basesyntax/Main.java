package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(7, Color.WHITE);
        square.draw();
        Rectangle rectangle = new Rectangle(4, 7, Color.WHITE);
        rectangle.draw();
        RightTriangle rightTriangle = new RightTriangle(5, 7, Color.WHITE);
        rightTriangle.draw();
        Circle circle = new Circle(6, Color.WHITE);
        circle.draw();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(5, 6, 7, Color.WHITE);
        isoscelesTrapezoid.draw();
    }

}
