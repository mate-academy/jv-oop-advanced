package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Square;
import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        final int NUMBER_OF_FIGURES = 10;
        final int HALF = NUMBER_OF_FIGURES / 2;

        final Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < HALF; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = HALF; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
