package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final double MAX_RADIUS = 1.8;
    private final int MAX_VALUES = 6;

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUES));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUES), random.nextInt(MAX_VALUES));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUES), random.nextInt(MAX_VALUES));
    }

    private Figure getRandomRightTriangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUES), random.nextInt(MAX_VALUES));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUES));
    }

    public Figure getRandomFigure() {
        int value = random.nextInt(MAX_VALUES);
        switch (value) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            case 5:
                return getRandomSquare();
            default:

                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),  MAX_RADIUS);
    }
}
