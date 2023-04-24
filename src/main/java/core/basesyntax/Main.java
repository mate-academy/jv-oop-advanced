package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    private static final Figure[] FIGURES = new Figure[FIGURES_COUNT];

    public static void main(String[] args) {
        for (int i = 0; i < FIGURES.length / 2; i++) {
            FIGURES[i] = FIGURE_SUPPLIER.getRandomFigure();
            System.out.println(FIGURES[i].draw());
        }
        for (int i = FIGURES.length / 2; i > 0; i--) {
            FIGURES[i] = FIGURE_SUPPLIER.getDefaultFigure();
            System.out.println(FIGURES[i].draw());
        }
    }
}
