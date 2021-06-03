package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int getRandomIndex = new Random().nextInt(5);

        switch (getRandomIndex) {
            case 1:
                Figure square = new Square(colorSupplier.getRandomColor(), 1 + Math.random() * 20);
                return square;
            case 2:
                Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        1 + Math.random() * 20, 1 + Math.random() * 20);
                return rectangle;
            case 3:
                Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        1 + Math.random() * 20, 1 + Math.random() * 20);
                return rightTriangle;
            case 4:
                Figure circle = new Circle(colorSupplier.getRandomColor(), 1 + Math.random() * 20);
                return circle;
            case 5:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        1 + Math.random() * 20, 1 + Math.random() * 20, 1 + Math.random() * 20);
                return isoscelesTrapezoid;
            default:
                Figure circle1 = new Circle(colorSupplier.getRandomColor(), 1 + Math.random() * 20);
                return circle1;
        }
    }
}
