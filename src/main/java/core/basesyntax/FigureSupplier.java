package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int randomFigureType = random.nextInt(5);

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
        return new Circle(Color.WHITE.name(), 10);
    }

    private double getRandomSideLength() {
        return random.nextDouble() * 100;
    }

    private double getRandomRadius() {
        return random.nextDouble() * 50;
    }

    private double getRandomHeight() {
        return random.nextDouble() * 30;
    }
}

