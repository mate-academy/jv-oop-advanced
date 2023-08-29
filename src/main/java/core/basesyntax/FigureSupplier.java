package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DIMENSION_VALUE_LIMIT = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;

    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (randomizer.nextInt(Form.values().length)) {
            case 1:
                return prepareCircle();
            case 2:
                return prepareIsoscelesTrapezoid();
            case 3:
                return prepareRightTriangle();
            case 4:
                return prepareRectangle();
            default:
                return prepareSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomInteger() {
        return randomizer.nextInt(DIMENSION_VALUE_LIMIT);
    }

    private Circle prepareCircle() {
        return new Circle(colorSupplier.getRandomColor(), randomInteger());
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomInteger(), randomInteger(), randomInteger());
    }

    private RightTriangle prepareRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                randomInteger(), randomInteger());
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), randomInteger(), randomInteger());
    }

    private Square prepareSquare() {
        return new Square(colorSupplier.getRandomColor(), randomInteger());
    }
}
