package core.basesyntax;

import core.basesyntax.service.ColorSupplier;

public class Main {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        AbstractFigure[] figures = new AbstractFigure[FIGURE_COUNT];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < FIGURE_COUNT / 2) ? figureSupplier.getRandomFigure()
                                                : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
