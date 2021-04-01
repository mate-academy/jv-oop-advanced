package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = new Random().nextInt(FIGURE_COUNT);
        int randomValue = new Random().nextInt(MAX_VALUE);
        switch (randomNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), randomValue);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), randomValue,
                        randomValue);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomValue);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomValue,
                        randomValue);
            default:
                return new Circle(colorSupplier.getRandomColor(), randomValue);
        }
    }
}
