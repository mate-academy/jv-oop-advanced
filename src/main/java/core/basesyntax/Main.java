package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2)) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
