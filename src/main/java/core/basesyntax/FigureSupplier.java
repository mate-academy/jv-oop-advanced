package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_PROPERTY_SIZE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getRandomRectangle();
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomCircle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,
                DEFAULT_PROPERTY_SIZE);
    }

    private int getRandomProperySize() {
        return random.nextInt(DEFAULT_PROPERTY_SIZE);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomProperySize());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomProperySize());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomProperySize(),
                getRandomProperySize());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomProperySize(),
                getRandomProperySize());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomProperySize(),
                getRandomProperySize(),
                getRandomProperySize());
    }
}
