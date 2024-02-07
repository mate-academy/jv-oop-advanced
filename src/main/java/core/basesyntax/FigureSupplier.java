package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_BOUND = 45;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomTypeOfFigures()) {
            case CIRCLE :
                return getRandomCircle();
            case RECTANGLE :
                return getRandomRectangle();
            case RIGHT_TRIANGLE :
                return getRandomRightTriangle();
            case SQUARE :
                return getRandomSquare();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomCircle() {
        return new Circle(getRandomDouble(), colorSupplier.getRandomColor());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        return new Square(getRandomDouble(), colorSupplier.getRandomColor());
    }

    public FigureType getRandomTypeOfFigures() {
        return FigureType.values()[random.nextInt(FigureType.values().length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomDouble() {
        return random.nextInt(DEFAULT_BOUND);
    }
}
