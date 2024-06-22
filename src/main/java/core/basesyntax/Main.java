package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < NUMBER_OF_FIGURE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = NUMBER_OF_FIGURE / 2; i < NUMBER_OF_FIGURE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
