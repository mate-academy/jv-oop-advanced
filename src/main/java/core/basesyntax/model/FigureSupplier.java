package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 100;
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigure) {
            case 0:
                return new Circle(randomColor, getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(randomColor, getRandomSize(),
                        getRandomSize(), getRandomSize());
            case 2:
                return new Rectangle(randomColor, getRandomSize(), getRandomSize());
            case 3:
                return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
            case 4:
                return new Square(randomColor, getRandomSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        int defaultRadius = 10;
        String defaultColor = Color.WHITE.name();
        return new Circle(defaultColor, defaultRadius);
    }

    private int getRandomSize() {
        return random.nextInt(MAX_FIGURE_SIZE);
    }
}
