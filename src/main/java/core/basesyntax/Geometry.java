package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

public class Geometry {

    private static final int MAX_NUMBER_OF_FIGURES_TO_GENERATE = 20;
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfFigures = random.nextInt(MAX_NUMBER_OF_FIGURES_TO_GENERATE) + 1;
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
