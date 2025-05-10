package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i >= NUMBER_OF_FIGURES / 2) {
                figureArray[i] = figureSupplier.getDefaultFigure();
            } else {
                figureArray[i] = figureSupplier.getRandomFigure();
            }
            figureArray[i].draw();
        }
    }
}
