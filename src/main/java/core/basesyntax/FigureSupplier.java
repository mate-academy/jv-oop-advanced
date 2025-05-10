package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MIN_NUMBER = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigure) {
            case CIRCLE -> new Circle(randomColor, getRandomSide());
            case SQUARE -> new Square(randomColor, getRandomSide());
            case RECTANGLE -> new Rectangle(randomColor, getRandomSide(), getRandomSide());
            case RIGHT_TRIANGLE -> new RightTriangle(randomColor, getRandomSide(),
                    getRandomSide());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(randomColor, getRandomSide(),
                    getRandomSide(), getRandomSide());
        };
    }

    private int getRandomSide() {
        return random.nextInt(MIN_NUMBER, DEFAULT_RADIUS);
    }
}
