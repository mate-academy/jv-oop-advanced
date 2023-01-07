package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;
import core.basesyntax.figure.name.RandomName;

public class Main {
    private static final int ARR_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        RandomName randomName = new RandomName();
        Figure[] figures = new Figure[ARR_LENGTH];

        for (int i = 0; i < ARR_LENGTH; i++) {
            if (i < ARR_LENGTH / 2) {
                String nameFigure = randomName.getRandomName();
                Figure figure = figureSupplier.getRandomFigure(nameFigure);
                figures[i] = figure;
            }

            if (i >= ARR_LENGTH / 2) {
                Figure figure = figureSupplier.getDefaultFigure();
                figures[i] = figure;
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
