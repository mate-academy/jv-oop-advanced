package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_FIGURES = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public int getMaxNumber() {
        return MAX_FIGURES;
    }

    public Figure getRandomFigure() {
        int randomNumberFirst = random.nextInt(MIN_NUMBER, DEFAULT_RADIUS);
        int randomNumberSecond = random.nextInt(MIN_NUMBER, DEFAULT_RADIUS);
        int randomNumberThird = random.nextInt(MIN_NUMBER, DEFAULT_RADIUS);
        int index = random.nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigure) {
            case CIRCLE -> new Circle(randomColor, randomNumberFirst);
            case SQUARE -> new Square(randomColor, randomNumberFirst);
            case RECTANGLE -> new Rectangle(randomColor, randomNumberFirst, randomNumberSecond);
            case RIGHT_TRIANGLE -> new RightTriangle(randomColor, randomNumberFirst,
                    randomNumberSecond);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(randomColor, randomNumberFirst,
                    randomNumberSecond, randomNumberThird);
        };
    }
}
