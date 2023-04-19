package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNTER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_COUNTER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_COUNTER; i++) {
            if (i < (FIGURES_COUNTER / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
