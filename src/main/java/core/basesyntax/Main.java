package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final int NUMBER_OF_FIGURES_IN_FIRST_HALF = 3;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_OF_FIGURES_IN_FIRST_HALF; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = NUMBER_OF_FIGURES_IN_FIRST_HALF; i < NUMBER_OF_FIGURES; i++) {
            figuresArray[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure printFigure : figuresArray) {
            printFigure.draw();
        }
    }
}
