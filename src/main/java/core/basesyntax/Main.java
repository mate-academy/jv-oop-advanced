package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURE_ARRAY_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = FIGURE_ARRAY_SIZE / 2; i < FIGURE_ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
