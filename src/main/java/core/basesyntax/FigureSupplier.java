package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int FIGURES_AMOUNT = 5;
    private static final int MAX_LENGTH = 25;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int getRandomLength() {
        return random.nextInt((int) MAX_LENGTH + 1);
    }

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURES_AMOUNT) + 1;
        switch (value) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomLength());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength(), getRandomLength());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomLength(),
                        getRandomLength());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomLength());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomLength(),
                        getRandomLength());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
