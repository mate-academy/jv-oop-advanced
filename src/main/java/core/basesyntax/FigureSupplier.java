package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final Shape[] shapes = Shape.values();
    private static final int RADIUS = 10;
    private static final String COLOR = "WHITE";
    private Circle prepareCircle() {
        return new Circle();
    }
    private Square prepareSquare() {
        return new Square();
    }
    private Rectangle prepareRectangle() {
        return new Rectangle();
    }
    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid();
    }
    private RightTriangle prepareRightTriangle() {
        return new RightTriangle();
    }

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(shapes.length);

        switch (shapes[randomNumber]) {
            case CIRCLE:
                return prepareCircle();
            case SQUARE:
                return prepareSquare();
            case RECTANGLE:
                return prepareRectangle();
            case RIGHT_TRIANGLE:
                return prepareRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return prepareIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }
}
