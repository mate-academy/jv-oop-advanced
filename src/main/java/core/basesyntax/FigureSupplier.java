package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int RADIUS = 10;
    private static final int MAX_RANDOM_NUMBER = 20;
    private final Random random = new Random();
    private final ColorSupplier colorsupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FigureType.values().length);
        String randomColor = colorsupplier.getRandomColor();

        switch (FigureType.values()[randomFigure]) {
            case SQUARE:
                return new Square(randomColor, getRandomNumber());
            case CIRCLE:
                return new Circle(randomColor, getRandomNumber());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
            case RECTANGLE:
                return new Rectangle(randomColor,
                        getRandomNumber(),
                        getRandomNumber());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        getRandomNumber(),
                        getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER) + 1;
    }
}
