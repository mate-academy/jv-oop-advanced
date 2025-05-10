package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private static final int FIGURE_COUNT = 6;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return new Circle(getRandomColor(), getRandomInt());
            case 2:
                return new Rectangle(getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3:
                return new Square(getRandomColor(), getRandomInt());
            case 4:
                return new RightTriangle(getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 5:
                return new IsoscelesTrapezoid(getRandomColor(), getRandomInt(),
                        getRandomInt(), getRandomInt());
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

    private int getRandomInt() {
        return random.nextInt(MAX);
    }
}
