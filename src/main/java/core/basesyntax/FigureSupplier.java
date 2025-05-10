package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CONST_RADIUS = 10;
    private static final int MAX_SIDE = 100;
    private static final int NUM_OF_FIGURE = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (getRandomFigureNumber()) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CONST_RADIUS, Color.WHITE.name());
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomSide(), colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomSide(), colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomSide(), getRandomSide(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomSide(), getRandomSide(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                getRandomSide(), colorSupplier.getRandomColor());
    }

    private int getRandomSide() {
        return random.nextInt(MAX_SIDE);
    }

    private int getRandomFigureNumber() {
        return random.nextInt(NUM_OF_FIGURE);
    }
}
