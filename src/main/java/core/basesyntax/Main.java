package core.basesyntax;

public class Main {
    public static final int ARRAY_FIGURE_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_FIGURE_SIZE];
        for (int i = 0; i < ARRAY_FIGURE_SIZE; i++) {
            if (i < ARRAY_FIGURE_SIZE / 2) {
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
