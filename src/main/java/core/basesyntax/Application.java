package core.basesyntax;

import model.Figure;
import utility.FigureSupplier;

public class Application {
    private static final int MAX_LENGTH_ARRAY = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[MAX_LENGTH_ARRAY];

        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
    }
}
