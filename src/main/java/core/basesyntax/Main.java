package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            } else {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
