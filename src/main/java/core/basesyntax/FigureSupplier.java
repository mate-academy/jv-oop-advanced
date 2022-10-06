package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final DiffColor DEFAULT_CIRCLE_COLOR = DiffColor.white;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return generateCircle();
            case 1:
                return generateSquare();
            case 2:
                return generateRectangle();
            case 3:
                return generateRightTriangle();
            case 4:
                return generateIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private IsoscelesTrapezoid generateIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
    }

    private RightTriangle generateRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
    }

    private Rectangle generateRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
    }

    private Square generateSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE));
    }

    private Circle generateCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE));
    }
}
