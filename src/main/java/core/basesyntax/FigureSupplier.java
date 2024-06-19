package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorsupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FigureList.values().length);
        String randomColor = colorsupplier.getRandomColor();

        switch (FigureList.values()[randomFigure]) {
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

    private int getRandomNumber() {
        return random.nextInt(20) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }
}
