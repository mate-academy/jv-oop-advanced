package core.basesyntax;

public class Main {
    private static final int FIGURES_TO_GENERATE = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_TO_GENERATE; i++) {
            Figure currentFigure;
            if (i < 5) {
                currentFigure = figureSupplier.getRandomFigure();
            } else {
                currentFigure = figureSupplier.getDefaultFigure();
            }
            currentFigure.draw();
        }
    }
}
