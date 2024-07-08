package core.basesyntax;

import model.Figure;
import utility.FigureSupplier;

public class Application {
    private static final int MAX_LENGTH_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[MAX_LENGTH_ARRAY];

        for (int i = 0; i <= figures.length - 1; i++) {
            if (i % 2 == 0) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].print();
        }
    }
}
