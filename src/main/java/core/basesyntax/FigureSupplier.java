package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random random = new Random();
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_SIZE = 100;
    private static final int MAX_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(MAX_FIGURE);
        switch (indexFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(MAX_SIZE),
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
