package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
