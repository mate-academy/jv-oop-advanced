package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 5;
    private static final int FIRST_HALF = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIRST_HALF) {
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

