package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 4;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (i < FIGURES_COUNT / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
