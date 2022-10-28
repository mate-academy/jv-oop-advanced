package core.basesyntax;

public class Application {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[FIGURES_AMOUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_AMOUNT / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
            figureArray[i].draw();
        }
        for (int i = FIGURES_AMOUNT / 2; i < FIGURES_AMOUNT; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
            figureArray[i].draw();
        }
    }
}
