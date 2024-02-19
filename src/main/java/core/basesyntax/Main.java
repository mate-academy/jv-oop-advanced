package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    private static final int MAX_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = new Figure[MAX_FIGURES];
        for (int i = 0; i < MAX_FIGURES; i++) {
            if (i < MAX_FIGURES / 2) {
                figures[i] = fs.getRandomFigure();
            } else {
                figures[i] = fs.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
