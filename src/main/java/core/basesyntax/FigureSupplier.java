package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int VALUE_LIMIT = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;

    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (randomizer.nextInt(Figures.values().length)) {
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
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int randomInteger() {
        return randomizer.nextInt(VALUE_LIMIT);
    }

    private Circle prepareCircle() {
        return new Circle(randomInteger(), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                randomInteger(),
                randomInteger(),
                randomInteger(),
                colorSupplier.getRandomColor()
        );
    }

    private Square prepareSquare() {
        return new Square(randomInteger(), colorSupplier.getRandomColor());
    }

    private RightTriangle prepareRightTriangle() {
        return new RightTriangle(randomInteger(), randomInteger(), colorSupplier.getRandomColor());
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(randomInteger(), randomInteger(), colorSupplier.getRandomColor());
    }
}

