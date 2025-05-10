package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE_OF_UNITS = 10.0;
    private static final int COUNT_OF_FIGURE = 5;
    private static final double SIZE_OF_RADIUS = 10.0;
    private static final String COLOR_WHITE = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(COUNT_OF_FIGURE);
        String randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(randomColor, getRandomSize());
            case 1:
                return new Rectangle(randomColor, getRandomSize(), getRandomSize());
            case 2:
                return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
            case 3:
                return new Circle(randomColor, getRandomSize());
            case 4:
                return new IsoscelesTrapezoid(randomColor, getRandomSize(),
                        getRandomSize(),
                        getRandomSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_WHITE, SIZE_OF_RADIUS);
    }

    private double getRandomSize() {
        return random.nextDouble() * MAX_SIZE_OF_UNITS;
    }
}
