package core.basesyntax;

public class Main {
    public static final int FIGURE_ARRAY_SIZE = 6;
    public static final int RANDOM_FIGURE_COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];

        for (int i = 0; i < FIGURE_ARRAY_SIZE; i++) {
            if (i < RANDOM_FIGURE_COUNT) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
