package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int SIDE_LENGTH_MAX = 20;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final String[] figures = {"Square", "Rectangle", "RightTriangle",
            "Circle", "IsoscelesTrapezoid"};
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(figures.length);

        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                throw new RuntimeException("Unknown figure.");
        }
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(SIDE_LENGTH_MAX));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(SIDE_LENGTH_MAX),
                random.nextInt(SIDE_LENGTH_MAX));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(SIDE_LENGTH_MAX),
                random.nextInt(SIDE_LENGTH_MAX));
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(DEFAULT_RADIUS));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(SIDE_LENGTH_MAX),
                random.nextInt(SIDE_LENGTH_MAX),
                random.nextInt(SIDE_LENGTH_MAX));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
