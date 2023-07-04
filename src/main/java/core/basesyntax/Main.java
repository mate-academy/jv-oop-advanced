package core.basesyntax;

import core.basesyntax.model.Drawable;
import core.basesyntax.model.figure.Figure;
import core.basesyntax.service.FigureSupplier;

public class Main {
    private static int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = buildHalfRandomHalfDefault();
        draw(figures);
    }

    private static Figure[] buildHalfRandomHalfDefault() {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        int halfValue = NUMBER_OF_FIGURES / 2;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < halfValue; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = halfValue; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        return figures;
    }

    private static void draw(Drawable... drawables) {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
