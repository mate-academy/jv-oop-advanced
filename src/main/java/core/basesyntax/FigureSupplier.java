package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int indexOfFigure = new Random().nextInt(FIGURES_NUMBER);
        switch (indexOfFigure) {
            case 1: {
                return getRandomSquare();
            }
            case 2: {
                return getRandomRRectangle();
            }
            case 3: {
                return getRandomRightTriangle();
            }
            case 4: {
                return getRandomCircle();
            }
            default: {
                return getRandomIsoscelesTrapezoid();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRRectangle() {
        return new Rectangle(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }
}
