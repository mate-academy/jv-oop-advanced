package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final int DEFAULT_CIRCLES_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLES_RADIUS, Color.WHITE.toString());
    }
}
