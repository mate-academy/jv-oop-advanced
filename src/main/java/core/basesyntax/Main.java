package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_VALUE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_VALUE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
