package core.basesyntax;

import core.basesyntax.model.Figure;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i]);
            } else {
                figures[i] = defaultFigure;
                System.out.println(figures[i]);
            }
        }
    }
}
