package core.basesyntax;

public class Main {
    private static final int COUNT_OF_ARRAY = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[COUNT_OF_ARRAY];
        for (int i = 0; i < figureArray.length - 1; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        figureArray[COUNT_OF_ARRAY - 1] = figureSupplier.getDefaultFigure();
    }
}
