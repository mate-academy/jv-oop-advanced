package core.basesyntax;

public class Main {
    private static final int MAX_FIGURES_SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_FIGURES_SIZE];

        for (int i = 0; i < MAX_FIGURES_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = MAX_FIGURES_SIZE / 2; i < MAX_FIGURES_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
