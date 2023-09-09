package core.basesyntax;

public class Application {
    public static final int FIGURE_COUNT = 6;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            } else {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            }
        }
        for (Figure figure: figures) {
            System.out.println(figure);
        }
    }
}
