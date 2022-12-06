package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final int DEFAULT_COUNT_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[DEFAULT_COUNT_FIGURE];
        for (int i = 0; i < DEFAULT_COUNT_FIGURE; i++) {
            figures[i] = i < DEFAULT_COUNT_FIGURE / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
