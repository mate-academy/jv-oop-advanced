package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_VALUE = 100;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        // generate a specific figure based on the `figureNumber` value
        switch (figureNumber) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getIndexOfColor(), DEFAULT_RADIUS);
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getIndexOfColor(),
                random.nextInt(MAX_VALUE));
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getIndexOfColor(),
                random.nextInt(MAX_VALUE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getIndexOfColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getIndexOfColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getIndexOfColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

}
