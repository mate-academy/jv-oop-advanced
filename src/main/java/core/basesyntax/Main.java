package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            System.out.println(figures[i].draw());
        }
        for (int i = figures.length / 2; i > 0; i--) {
            figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            System.out.println(figures[i].draw());
        }
    }
}
