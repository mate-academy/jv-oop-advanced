package core.basesyntax;

public class Application {
    static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        final Figure[] figureArray = new Figure[6];
        final FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_AMOUNT / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
            figureArray[i].toDraw();
        }
        for (int i = FIGURES_AMOUNT / 2; i < FIGURES_AMOUNT; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
            figureArray[i].toDraw();
        }
    }
}
