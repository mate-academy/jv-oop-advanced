package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int NUMBER_OF_FIGURES_NAME = 5;
    private static final Random random = new Random();
    private static final String DEFAULT_COLOR = "white";
    private static final String DEFAULT_NAME = "circle";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_AREA_LIMIT = 100;

    private String getRandomFigureName() {
        return FigureName.values()[random.nextInt(NUMBER_OF_FIGURES_NAME)].name();
    }

    public Figure getRandomFigure() {
        String randomColor = getRandomColor();
        String randomFigureName = getRandomFigureName();
        double randomArea = random.nextDouble(MAX_AREA_LIMIT);
        return new Figure(randomColor, randomFigureName, randomArea);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS, DEFAULT_NAME);
    }
}

