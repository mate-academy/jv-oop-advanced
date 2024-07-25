package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int NUMBER_OF_FIGURES_NAME = 5;
    private static final Random random = new Random();
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private static final int LIMIT = 20;

    public Figure getRandomFigure() {
        String randomColor = getRandomColor();
        int randomValues = random.nextInt(LIMIT);
        switch (getRandomFigureName()) {
            case "CIRCLE":
                return new Circle(randomColor, randomValues);
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(randomColor, randomValues,
                        randomValues, randomValues);
            case "RECTANGLE":
                return new Rectangle(randomColor, randomValues, randomValues);
            case "RIGHT_TRIANGLE":
                return new RightTriangle(randomColor, randomValues, randomValues);
            case "SQUARE":
                return new Square(randomColor, randomValues);
            default: throw new RuntimeException("Wrong Figure type provided");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private String getRandomFigureName() {
        return FigureName.values()[random.nextInt(NUMBER_OF_FIGURES_NAME)].name();
    }
}

