package core.basesyntax;

public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[SIZE];
        for (int i = 0; i < array.length; i++) {
            if (i < SIZE / 2) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
