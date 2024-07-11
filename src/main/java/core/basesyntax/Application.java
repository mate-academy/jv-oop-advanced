package core.basesyntax;

public class Application {
    private static final int ARRAY_LENGTH = 6;
    private static final int ARRAY_HALF_LENGTH = ARRAY_LENGTH / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_HALF_LENGTH; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }

        for (int i = ARRAY_HALF_LENGTH; i < ARRAY_LENGTH; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figureArray) {
            figure.getFigureData();
        }
    }
}
