package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIZE_INDEXES = 5;
    private static final int RADIUS_CIRCLE = 10;
    private static final int RANDOM_NUMBER = 100;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int randomFigureType = random.nextInt(SIZE_INDEXES);

        switch (randomFigureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomSideLength());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSideLength(),
                        getRandomSideLength());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomSideLength(),
                        getRandomSideLength());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomRadius());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSideLength(),
                        getRandomSideLength(), getRandomHeight());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS_CIRCLE);
    }

    private double getRandomSideLength() {
        return random.nextDouble(RANDOM_NUMBER);
    }

    private double getRandomRadius() {
        return random.nextDouble(RANDOM_NUMBER);
    }

    private double getRandomHeight() {
        return random.nextDouble(RANDOM_NUMBER);
    }
}

