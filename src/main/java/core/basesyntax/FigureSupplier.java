package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private static final int FIGURE_COUNT = 6;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (getRandomInt(FIGURE_COUNT)) {
            case 1:
                return new Circle(getRandomColor(), getRandomInt(MAX));
            case 2:
                return new Rectangle(getRandomColor(), getRandomInt(MAX),
                        getRandomInt(MAX));
            case 3:
                return new Square(getRandomColor(), getRandomInt(MAX));
            case 4:
                return new RightTriangle(getRandomColor(), getRandomInt(MAX),
                        getRandomInt(MAX));
            case 5:
                return new IsoscelesTrapezoid(getRandomColor(), getRandomInt(MAX),
                        getRandomInt(MAX), getRandomInt(MAX));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private String getRandomColor() {
        return supplier.getRandomColor();
    }

    private int getRandomInt(int max) {
        return random.nextInt(max);
    }
}
