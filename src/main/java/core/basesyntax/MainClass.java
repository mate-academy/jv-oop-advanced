package core.basesyntax;

import core.basesyntax.figures.Figure;

public class MainClass {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);
        int i = 0;
        Figure[] figures = new Figure[6];

        for (i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
            figures[i].draw();
        }

    }
}
