package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    private static final int QUANTITY_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        return switch (RANDOM.nextInt(QUANTITY_OF_FIGURES)) {
            case 0 -> getCircle();
            case 1 -> getIsoscelesTrapezoid();
            case 2 -> getSquare();
            case 3 -> getRectangle();
            case 4 -> getRightTriangle();
            default -> throw new IllegalStateException("Wrong number. Please choose from 0 to 4");
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomNumber() {
        return RANDOM.nextDouble(BOUND);
    }

    private Figure getCircle() {
        return new Circle(COLOR_SUPPLIER.getRandomColor(), getRandomNumber());
    }

    private Figure getSquare() {
        return new Square(COLOR_SUPPLIER.getRandomColor(), getRandomNumber());
    }

    private Figure getRectangle() {
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(), getRandomNumber(),
                getRandomNumber());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(), getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(COLOR_SUPPLIER.getRandomColor(), getRandomNumber(),
                getRandomNumber());
    }
}
