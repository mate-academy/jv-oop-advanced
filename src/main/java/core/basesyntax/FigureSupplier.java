package core.basesyntax;

import static core.basesyntax.Circle.DEFAULT_RADIUS;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private FigureTypeSupplier figureType = new FigureTypeSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomVariable() {
        return random.nextInt(MAX_VALUE);
    }

    private String getRandomColorFigure() {
        return colorSupplier.getRandomColor();
    }

    private Circle createCircle() {
        return new Circle(getRandomVariable(), getRandomColorFigure());
    }

    private Rectangle createRectangle() {
        return new Rectangle(getRandomVariable(), getRandomVariable(), getRandomColorFigure());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomVariable(), getRandomVariable(),
                getRandomVariable(), getRandomColorFigure());
    }

    private Square createSquare() {
        return new Square(getRandomVariable(), getRandomColorFigure());
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(getRandomVariable(), getRandomVariable(), getRandomColorFigure());
    }

    public Figure getRandomFigure() {
        switch (figureType.getRandomFigureType()) {
            case CIRCLE:
                return createCircle();
            case RECTANGLE:
                return createRectangle();
            case ISOSCELES_TRAPEZOID:
                return createIsoscelesTrapezoid();
            case SQUARE:
                return createSquare();
            case RIGHT_TRIANGLE:
                return createRightTriangle();
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
