package core.basesyntax;

public class Main {
    public static final int SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] array = new Figure[SIZE];
        for (int i = 0; i < array.length; i++) {
            if (i < SIZE / 2) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
            array[i].toDraw();
        }
    }
}
