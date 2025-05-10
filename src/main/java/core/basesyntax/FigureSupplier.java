package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LIMIT = 5;
    private static final int RANDOM_LIMIT = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_NAME = "Circle";
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomType = random.nextInt(FIGURE_LIMIT);
        return switch (randomType) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomRectangle();
            case 2 -> getRandomSquare();
            case 3 -> getRandomIsoscelesTrapezoid();
            case 4 -> getRandomRightTriangle();
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_NAME, DEFAULT_COLOR);
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextDouble()
                *
                RANDOM_LIMIT, "Circle", colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextDouble()
                *
                RANDOM_LIMIT, random.nextDouble() * RANDOM_LIMIT,
                "RightTriangle", colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextDouble()
                *
                RANDOM_LIMIT, random.nextDouble()
                *
                RANDOM_LIMIT, random.nextDouble() * RANDOM_LIMIT,
                "IsoscelesTrapezoid", colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextDouble()
                *
                RANDOM_LIMIT, random.nextDouble()
                *
                RANDOM_LIMIT, "Rectangle", colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextDouble()
                *
                RANDOM_LIMIT, "Square", colorSupplier.getRandomColor());
    }
}
