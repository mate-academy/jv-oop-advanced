package core.basesyntax;

import java.util.Random;

public class FiguresRindomizer {
    private Random random = new Random();

    public Figure getRandomCircle() {
        ColorSupplier nextColor = new ColorSupplier();
        Circle circle = new Circle(nextColor.getRandomColor(), random.nextInt());
        circle.setArea(circle.getArea());
        return circle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        ColorSupplier nextColor = new ColorSupplier();
        IsoscelesTrapezoid isoTrap = new IsoscelesTrapezoid(nextColor.getRandomColor(),
                random.nextInt(), random.nextInt(), random.nextInt());
        isoTrap.setArea(isoTrap.getArea());
        return isoTrap;
    }

    public Figure getRandomRectangle() {
        ColorSupplier nextColor = new ColorSupplier();
        Rectangle rectangle = new Rectangle(nextColor.getRandomColor(), random.nextInt(),
                random.nextInt());
        rectangle.setArea(rectangle.getArea());
        return rectangle;
    }

    public Figure getRandomRightTriangle() {
        ColorSupplier nextColor = new ColorSupplier();
        RightTriangle rightTriangle = new RightTriangle(nextColor.getRandomColor(),
                random.nextInt(), random.nextInt());
        rightTriangle.setArea(rightTriangle.getArea());
        return rightTriangle;
    }

    public Figure getRandomSquare() {
        ColorSupplier nextColor = new ColorSupplier();
        Square square = new Square(nextColor.getRandomColor(), random.nextInt());
        square.setArea(square.getArea());
        return square;
    }
}
