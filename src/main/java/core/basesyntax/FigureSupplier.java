package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (number) {
            case 0:
                return new Circle(randomColor, getRandomSize());
            case 1:
                return new Rectangle(randomColor, getRandomSize(), getRandomSize());
            case 2:
                return new Square(randomColor, getRandomSize());
            case 3:
                double baseAngle = random.nextDouble(85.00);
                return new IsoscelesTrapezoid(randomColor, getRandomSize(), getRandomSize(),
                        getRandomSize(), baseAngle);
            default:
                return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_RADIUS);
    }

    private double getRandomSize() {
        return random.nextDouble(100.00);
    }
}
