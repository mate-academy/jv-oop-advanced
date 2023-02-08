package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_LENGTH = 100;

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        switch (getNumberOfRandomFigure()) {
            case 0:
                return new Circle(getRandomLength(), color);
            case 1:
                return new Rectangle(getRandomLength(), getRandomLength(), color);
            case 2:
                return new Square(getRandomLength(), color);
            case 3:
                return new IsoscelesTrapezoid(getRandomLength(),
                        getRandomLength(), getRandomLength(), color);
            case 4:
                return new RightTriangle(getRandomLength(), getRandomLength(), color);
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        final int defaultRadius = 10;
        return new Circle(defaultRadius, Color.WHITE.name());
    }

    private int getRandomLength() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_LENGTH);
    }

    private int getNumberOfRandomFigure() {
        Random random = new Random();
        final int amountOfFigures = 5;
        return random.nextInt(amountOfFigures);
    }
}
