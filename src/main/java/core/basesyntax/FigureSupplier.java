package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;

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

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomDouble(), colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomDouble(), colorSupplier.getRandomColor());
    }

    public TypeOfFigure getRandomTypeOfFigures() {
        return TypeOfFigure.values()[random.nextInt(TypeOfFigure.values().length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }

    public double getRandomDouble() {
        return random.nextInt(45);
    }
}
