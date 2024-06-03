package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
