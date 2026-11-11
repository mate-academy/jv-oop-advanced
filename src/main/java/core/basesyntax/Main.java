package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;
    private static final int RANDOM_FIGURES_COUNT = FIGURE_ARRAY_SIZE / 2;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] arrayFigure = new Figure[FIGURE_ARRAY_SIZE];

        for (int i = 0; i < FIGURE_ARRAY_SIZE; i++) {
            if (i < RANDOM_FIGURES_COUNT) {
                arrayFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrayFigure[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < FIGURE_ARRAY_SIZE; i++) {
            arrayFigure[i].draw();
        }
    }
}
