package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 5;
    private static final int NUMBER_TO_HALVE_THE_ARRAY = 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i / NUMBER_TO_HALVE_THE_ARRAY == 0) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.getPrintInfo();
        }
    }
}
