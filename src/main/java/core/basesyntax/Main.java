package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigure = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                randomFigure[i] = figureSupplier.getRandomFigure();
            } else {
                randomFigure[i] = figureSupplier.getDefaultFigure();
            }
            randomFigure[i].draw();
        }
    }
}
