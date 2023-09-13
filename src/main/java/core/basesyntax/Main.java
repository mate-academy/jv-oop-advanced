package core.basesyntax;

public class Main {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    private static final int NUMBER_OF_REPEAT = 4;
    private static final Figure [] figures = new Figure[4];
    private static final int MIDDLE = figures.length / 2;

    public static void main(String[] args) {
        for (int i = 0; i < MIDDLE;i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            figures[i].draw();
        }
        for (int i = MIDDLE;i < NUMBER_OF_REPEAT;i++) {
            figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            figures[i].draw();
        }
    }
}
