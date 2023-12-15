package core.basesyntax;

import core.basesyntax.figures.Drawable;
import core.basesyntax.figures.Figure;
import core.basesyntax.utils.FigureSupplier;

public class HelloWorld {
    private static final int FIGURE_COUNT = 10;

    public static void main(String[] args) {
        Drawable[] drawables = generateFigures();

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    private static Figure[] generateFigures() {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        return figures;
    }
}
