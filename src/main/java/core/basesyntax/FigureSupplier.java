package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_COUNT);
        switch (randomIndex) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
