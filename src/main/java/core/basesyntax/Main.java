package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                figure[i] = figureSupplier.getRandomFigure();
                figure[i].drawTheInformation();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
                figure[i].drawTheInformation();
            }
        }
    }
}
