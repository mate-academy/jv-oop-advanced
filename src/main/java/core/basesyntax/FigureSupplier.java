package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_NUMBER = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberFigure = new Random().nextInt(4);
        switch (numberFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getRandomCircle() {
        return new Circle(getRandomDouble(), colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        return new Square(getRandomDouble(), colorSupplier.getRandomColor());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                getRandomDouble(), colorSupplier.getRandomColor());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomDouble(), getRandomDouble(),
                colorSupplier.getRandomColor());
    }

    public double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NUMBER, DEFAULT_COLOR);
    }
}
