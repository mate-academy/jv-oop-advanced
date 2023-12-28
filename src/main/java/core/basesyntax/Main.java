package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT + 1];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[FIGURE_COUNT] = figureSupplier.getDefaultFigure();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
