package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final Random RANDOM = new Random();
    private static final String DEF_CIRCLE_COLOR = Color.WHITE.name();
    private static final int DEF_CIRCLE_RADIUS = 10;
    private static final int BOUND = 5;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(BOUND);

        switch (figureType) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            case 4:
                return createIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public double getRandomSide() {
        return RANDOM.nextDouble(MAX_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_CIRCLE_COLOR, DEF_CIRCLE_RADIUS);
    }

    private Square createSquare() {
        return new Square(COLOR_SUPPLIER.getRandomColor(),
                getRandomSide());
    }

    private Rectangle createRectangle() {
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                getRandomSide(),
                getRandomSide());
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                getRandomSide(),
                getRandomSide());
    }

    private Circle createCircle() {
        return new Circle(COLOR_SUPPLIER.getRandomColor(),
                getRandomSide());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                getRandomSide(),
                getRandomSide(),
                getRandomSide());
    }
}

