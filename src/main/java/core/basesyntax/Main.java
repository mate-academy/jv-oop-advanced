package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int TOTAL_NUMBER_OF_FIGURES = 6;
    private static final int NUMBER_OF_RANDOM_FIGURES = 3;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomGenerator = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(randomGenerator, colorSupplier);
        Figure[] figureList = new Figure[TOTAL_NUMBER_OF_FIGURES];
        for (int i = 0; i < TOTAL_NUMBER_OF_FIGURES; i++) {
            figureList[i] = i < NUMBER_OF_RANDOM_FIGURES ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            System.out.println(figureList[i].draw());
        }
    }
}
