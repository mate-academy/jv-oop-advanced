package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
                figures[i].draw();
                continue;
            }
            figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            figures[i].draw();
        }
    }
}
