package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Integer getInteger() {
        Integer randomInteger = random.nextInt((100) + 1);
        return randomInteger;
    }

    private Circle prepareCircle() {
        return new Circle(colorSupplier.getRandomColor(),getInteger());
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getInteger(), getInteger());
    }

    private Square prepareSquare() {
        return new Square(colorSupplier.getRandomColor(), getInteger());
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getInteger(), getInteger(), getInteger());
    }

    private RightTriangle prepareRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getInteger(), getInteger());
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return prepareCircle();
            case 1:
                return prepareRectangle();
            case 2:
                return prepareSquare();
            case 3:
                return prepareIsoscelesTrapezoid();
            case 4:
                return prepareRightTriangle();
            default:
                getDefoultFigure();
        }
        return getRandomFigure();
    }

    public Figure getDefoultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        return circle;
    }
}
