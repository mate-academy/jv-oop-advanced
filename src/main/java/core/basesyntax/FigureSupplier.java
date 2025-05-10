package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIDE = 10;
    private static final int RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0 :
                return prepareSquare();
            case 1 :
                return prepareCircle();
            case 2 :
                return prepareRightTriangle();
            case 3 :
                return prepareIsoscelesTrapezoid();
            default :
                return prepareRectangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }

    private Square prepareSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble() * MAX_SIDE);
    }

    private Circle prepareCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * MAX_SIDE);
    }

    private RightTriangle prepareRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * MAX_SIDE,
                random.nextDouble() * MAX_SIDE);
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble() * MAX_SIDE, random.nextDouble() * MAX_SIDE,
                random.nextDouble() * MAX_SIDE);
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * MAX_SIDE,
                random.nextDouble() * MAX_SIDE);
    }
}
