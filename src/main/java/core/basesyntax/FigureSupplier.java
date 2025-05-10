package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_NUMBER = 5;
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 1;
    private static final double DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(MAX_FIGURE_NUMBER);
        Color randomColor = supplier.getRandomColor();

        switch (randomFigureNumber) {
            case 0:
                return new Circle(randomColor,
                        getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(randomColor,
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
            case 2:
                return new Rectangle(randomColor,
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(randomColor,
                        getRandomNumber(), getRandomNumber());
            case 4:
                return new Square(randomColor,
                        getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
