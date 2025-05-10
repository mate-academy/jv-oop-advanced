package core.basesyntax;

public class Main {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        AbstractFigure[] figures = new AbstractFigure[FIGURES_AMOUNT];

        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            if (i < FIGURES_AMOUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
