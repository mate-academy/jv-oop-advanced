package core.basesyntax;

public class Main {
    public static final int SIZE_OF_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] arrayOfFigures = new Figure[SIZE_OF_ARRAY];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < (arrayOfFigures.length / 2)) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(arrayOfFigures[i].draw());
        }
    }
}
