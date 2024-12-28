package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.service.FigureSupplier;
import core.basesyntax.variables.Constants;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        final Figure[] figures = new Figure[Constants.NUMBER_OF_FIGURES];

        for (int i = 0; i < Constants.HALF; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = Constants.HALF; i < Constants.NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
