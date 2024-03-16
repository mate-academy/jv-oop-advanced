package core.basesyntax;

public class ApplicationMain {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MEDIUM_OF_NUMBER_OF_FIGURES = NUMBER_OF_FIGURES / 2;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i <= MEDIUM_OF_NUMBER_OF_FIGURES) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].toDraw();
        }
    }
}
