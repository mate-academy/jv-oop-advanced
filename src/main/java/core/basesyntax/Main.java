package core.basesyntax;

public class Main {
    private static final int TOTAL_NUMBER_OF_FIGURES = 6;
    private static final int NUMBER_OF_RANDOM_FIGURES = 3;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figureList = new Figure[TOTAL_NUMBER_OF_FIGURES];
        for (int i = 0; i < TOTAL_NUMBER_OF_FIGURES; i++) {
            figureList[i] = i < NUMBER_OF_RANDOM_FIGURES ? supplier.getRandomFigure()
                    : supplier.getDefaultFigure();
            figureList[i].draw();
        }
    }
}
