package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_AMOUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_AMOUNT);
        switch (randomNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomProperty(), getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomProperty(), getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomProperty(), getRandomProperty(),
                getRandomProperty(), supplier.getRandomColor());
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private double getRandomProperty() {
        return random.nextDouble();
    }
}
