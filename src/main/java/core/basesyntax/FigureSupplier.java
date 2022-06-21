package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomSquare();
            case 5:
            default:
                return getRandomCircle();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(supplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }
}
