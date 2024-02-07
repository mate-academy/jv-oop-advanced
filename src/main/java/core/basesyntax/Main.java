package core.basesyntax;

public class Main {
    private static final int SIZE_ARRAY = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigure = new Figure[SIZE_ARRAY];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i < arrayOfFigure.length / 2) {
                arrayOfFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigure[i] = figureSupplier.getDefaultFigure();
            }
            arrayOfFigure[i].draw();
        }
    }
}
