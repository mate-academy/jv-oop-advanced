package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < FIGURES_COUNT / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = FIGURES_COUNT / 2; i < FIGURES_COUNT; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.draw();
            System.out.println();
        }
    }
}
