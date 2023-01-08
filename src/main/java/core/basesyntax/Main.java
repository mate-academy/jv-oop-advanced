package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;
import core.basesyntax.figure.name.FigureNameSupplier;

public class Main {
    private static final int ARR_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        FigureNameSupplier figureNameSupplier = new FigureNameSupplier();
        Figure[] figures = new Figure[ARR_LENGTH];

        for (int i = 0; i < ARR_LENGTH; i++) {
            String nameFigure = figureNameSupplier.getRandomName();

            if (i < ARR_LENGTH / 2) {
                Figure figure = figureSupplier.getRandomFigure(nameFigure);
                figures[i] = figure;
            } else {
                Figure figure = figureSupplier.getDefaultFigure();
                figures[i] = figure;
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
