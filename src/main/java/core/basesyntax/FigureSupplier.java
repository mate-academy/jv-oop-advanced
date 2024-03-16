package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = Figures.values().length;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int legSize = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                legSize, legSize, random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomFigure() {
        Figures randomFigure = Figures.values()[random.nextInt(FIGURE_COUNT)];
        return switch (randomFigure) {
            case CIRCLE -> getRandomCircle();
            case SQUARE -> getRandomSquare();
            case RECTANGLE -> getRandomRectangle();
            case ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid();
            case RIGHT_TRIANGLE -> getRandomRightTriangle();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
