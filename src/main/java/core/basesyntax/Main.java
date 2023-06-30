package core.basesyntax;

import core.basesyntax.model.Drawable;
import core.basesyntax.model.figure.Figure;
import core.basesyntax.service.FigureSupplier;

public class Main {
    private static int NUMBER_OF_FIGURES;

    static {
        NUMBER_OF_FIGURES = 6;
    }

    public static void main(String[] args) {
        Figure[] figures = buildHalfRandomHalfDefault(NUMBER_OF_FIGURES);
        draw(figures);
    }

    private static Figure[] buildHalfRandomHalfDefault(int numberOfFigures) {
        Figure[] figures = new Figure[numberOfFigures];
        int halfValue = numberOfFigures / 2;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < halfValue; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = halfValue; i < numberOfFigures; i++) {
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
