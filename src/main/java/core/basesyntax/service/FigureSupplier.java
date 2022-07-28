package core.basesyntax.service;

import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 50;
    public static final int FIGURE_COUNT = FigureType.values().length;
    public static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randFigureIndex = random.nextInt(FIGURE_COUNT);
        switch (FigureType.values()[randFigureIndex]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

