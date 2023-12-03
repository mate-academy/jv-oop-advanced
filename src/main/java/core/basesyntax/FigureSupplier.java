package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_VALUE = 10;
    private final int numberOfFigures = 5;
    private final int maxValue = 15;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = new Random().nextInt(numberOfFigures);
        int first = new Random().nextInt(maxValue);
        switch (number) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),  new Random().nextInt(maxValue));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), new Random().nextInt(maxValue),
                        new Random().nextInt(maxValue));
            case 2:
                return new Square(colorSupplier.getRandomColor(), new Random().nextInt(maxValue));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), first,
                        new Random().nextInt(maxValue), new Random().nextInt(maxValue));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), new Random().nextInt(maxValue),
                        new Random().nextInt(maxValue));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }
}
