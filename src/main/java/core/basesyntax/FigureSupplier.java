package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomInt(), colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                getRandomDouble(), colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomInt(),
                getRandomInt(), colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomInt(),
                getRandomInt(), colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomInt(), colorSupplier.getRandomColor());
    }

    private int getRandomInt() {
        return random.nextInt(MAX_VALUE);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

}
