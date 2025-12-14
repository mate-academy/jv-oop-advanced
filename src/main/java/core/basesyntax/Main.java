package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;
    private static final int RANDOM_FIGURES_COUNT = FIGURES_COUNT / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < RANDOM_FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = RANDOM_FIGURES_COUNT; i < FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
