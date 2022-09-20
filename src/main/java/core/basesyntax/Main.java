package core.basesyntax;

import java.util.Arrays;

public class Main {
    private static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        Arrays.stream(figures).forEach(Figure::draw);
    }
}
