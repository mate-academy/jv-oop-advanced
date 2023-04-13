package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("pink", 6.3);
        square.draw();
        Rectangle rectangle = new Rectangle("blue", 5.2, 8.7);
        rectangle.draw();
        RightTriangle rightTriangle = new RightTriangle("black", 10.2, 5.3);
        rightTriangle.draw();
        Circle circle = new Circle("yellow",4.7);
        circle.draw();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid("brown",2.5, 2.8, 1.7);
        isoscelesTrapezoid.draw();
    }
}
