package core.basesyntax;

import java.util.Locale;

public class Main {
    public static final int FIGURES_NUMBERS = 6;

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_NUMBERS];
        for (int i = 0; i < figures.length; i++) {
            if (i < FIGURES_NUMBERS / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
