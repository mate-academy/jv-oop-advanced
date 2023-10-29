package core.basesyntax;

public class Main {
    private static final int TOTAL_FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[TOTAL_FIGURE_COUNT];

        for (int i = 0; i < TOTAL_FIGURE_COUNT; i++) {
            if (i < TOTAL_FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
