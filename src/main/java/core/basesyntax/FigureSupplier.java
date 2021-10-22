package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_RANDOM_NUMBER = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(getRandomNumber(), ColorSupplier.getRandomColor());
            case 1:
                return new Square(getRandomNumber(), ColorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(),
                        getRandomNumber(), ColorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomNumber(), getRandomNumber(),
                        ColorSupplier.getRandomColor());
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.getName());
    }

    private int getRandomNumber() {
        return new Random().nextInt(MAX_RANDOM_NUMBER);
    }
}
