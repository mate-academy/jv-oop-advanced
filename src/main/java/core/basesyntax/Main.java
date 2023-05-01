package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static final int SIZE_ARRAY = 20;

    public static void main(String[] args) {
        //FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayFigurs = new Figure[SIZE_ARRAY];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i < SIZE_ARRAY / 2) {
                arrayFigurs[i] = figureSupplier.getRandomFigureName();
            } else {
                arrayFigurs[i] = figureSupplier.getDefaultFigure();
            }
        }
    }
}
