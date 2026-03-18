package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private enum Figures {
        CIRCLE,
        ISOSCELES_TRAPEZOID,
        RIGHT_TRIANGLE,
        RECTANGLE,
        SQUARE
    }

    private static final Random randomizer = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_SIZE = 20;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = Colors.WHITE.name();

    public Figure getRandomFigure() {
        int randomIndex = randomizer.nextInt(Figures.values().length);
        Figures randomFigure = Figures.values()[randomIndex];
        int randomValue = randomizer.nextInt(MAX_SIZE);
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigure) {
            case SQUARE: {
                return new Square(randomValue, randomColor);
            }
            case RECTANGLE: {
                int randomValue2 = randomizer.nextInt(MAX_SIZE);
                return new Rectangle(randomValue, randomValue2, randomColor);
            }
            case RIGHT_TRIANGLE: {
                int randomValue2 = randomizer.nextInt(MAX_SIZE);
                return new RightTriangle(randomValue, randomValue2, randomColor);
            }
            case ISOSCELES_TRAPEZOID: {
                int randomValue2 = randomizer.nextInt(MAX_SIZE);
                int randomValue3 = randomizer.nextInt(MAX_SIZE);
                return new IsoscelesTrapezoid(randomValue, randomValue2, randomValue3, randomColor);
            }
            default: {
                return new Circle(randomValue, randomColor);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR);
    }
}
