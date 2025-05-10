package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int MAX_VALUE = 15;
    private static final Random random = new Random();

    public static Random getRandom() {
        return random;
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (randomIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
            default:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_VALUE);
    }
}
