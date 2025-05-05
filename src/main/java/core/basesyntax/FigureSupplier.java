package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_OF_FIGURE = 5;
    private static final double MAXIMUM_VALUE = 50.0;
    private final Circle defaultFigure = new Circle(Color.WHITE.name().toLowerCase(),
            DEFAULT_RADIUS);
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new Circle(randomColor, randomSize());
            case 1:
                return new Square(randomColor, randomSize());
            case 2:
                return new IsoscelesTrapezoid(randomColor,
                        randomSize(), randomSize(), randomSize());
            case 3:
                return new RightTriangle(randomColor,
                        randomSize(), randomSize());
            default:
                return new Rectangle(randomColor, randomSize(), randomSize());
        }
    }

    public double randomSize() {
        return random.nextDouble() * MAXIMUM_VALUE;
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
