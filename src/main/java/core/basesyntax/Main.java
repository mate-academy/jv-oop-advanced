package core.basesyntax;

public class Main {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    private static final int NUMBER_OF_REPEAT = 4;

    public static void main(String[] args) {
        Figure [] figures = new Figure[4];
        int middle = figures.length / 2;
        for (int i = 0; i < NUMBER_OF_REPEAT;i++) {
            if (i < middle) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
                figures[i].ableToDraw();
            } else {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
                figures[i].ableToDraw();
            }
        }
    }
}
