package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES_NAME = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int LIMIT = 20;

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        switch (getRandomFigureName()) {
            case CIRCLE:
                return new Circle(randomColor, getRandomValue());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor, getRandomValue(),
                        getRandomValue(), getRandomValue());
            case RECTANGLE:
                return new Rectangle(randomColor, getRandomValue(), getRandomValue());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, getRandomValue(), getRandomValue());
            case SQUARE:
                return new Square(randomColor, getRandomValue());
            default: throw new RuntimeException("Wrong Figure type provided");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private FigureName getRandomFigureName() {
        return FigureName.values()[random.nextInt(NUMBER_OF_FIGURES_NAME)];
    }

    private int getRandomValue() {
        int randomValues = random.nextInt(LIMIT);
        return randomValues;
    }
}

