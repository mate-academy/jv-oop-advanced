package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomLength() {
        return (new Random().nextInt(20));
    }

    public Figure getRandomFigure() {
        int getRandomIndex = new Random().nextInt(5);

        switch (getRandomIndex) {
            case 1:
                Figure square = new Square(colorSupplier.getRandomColor(), getRandomLength());
                return square;
            case 2:
                Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength());
                return rectangle;
            case 3:
                Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength());
                return rightTriangle;
            case 4:
                Figure circle = new Circle(colorSupplier.getRandomColor(), getRandomLength());
                return circle;
            case 5:
            default:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength(), getRandomLength());
                return isoscelesTrapezoid;
        }
    }
}
