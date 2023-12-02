package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int numberOfFigures = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxValue = 15;

    public Figure getRandomFigure() {
        int number = new Random().nextInt(numberOfFigures);
        int first = new Random().nextInt(maxValue);
        int second = new Random().nextInt(maxValue);
        int third = new Random().nextInt(maxValue);
        switch (number) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), first);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), first, second);
            case 2:
                return new Square(colorSupplier.getRandomColor(), first);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), first, second, third);
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), first, second);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
