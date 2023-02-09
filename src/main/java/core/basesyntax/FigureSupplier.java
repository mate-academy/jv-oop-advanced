package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_LENGTH = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final int AMOUNT_OF_FIGURES = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();

        switch (random.nextInt(AMOUNT_OF_FIGURES)) {
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
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private int getRandomLength() {
        return random.nextInt(MAX_RANDOM_LENGTH);
    }
}
