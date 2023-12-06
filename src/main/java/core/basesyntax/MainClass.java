package core.basesyntax;

import core.basesyntax.figures.Figure;

public class MainClass {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            figures[i] = (i < 3) ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
