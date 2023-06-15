package core.basesyntax;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.figsupply.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            if (figure != null) {
                figure.drawInfo();
            }
        }
    }
}
