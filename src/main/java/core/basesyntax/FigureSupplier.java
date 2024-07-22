package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int NUMBER_OF_FIGURES_NAME = 5;
    private static final Random random = new Random();
    private static final String DEFAULTCOLOR = "white";
    private static final String DEFAULTNAME = "circle";
    private static final int DEFAULTRADIUS = 10;

    private String getRandomFigureName() {
        return FigureName.values()[random.nextInt(NUMBER_OF_FIGURES_NAME)].name();
    }

    public Figure getRandomFigure() {
        String randomColor = getRandomColor();
        String randomFigureName = getRandomFigureName();
        double randomArea = random.nextDouble();
        return new Figure(randomColor, randomFigureName, randomArea);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULTCOLOR, DEFAULTRADIUS, DEFAULTNAME);
    }
}
