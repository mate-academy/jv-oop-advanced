package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final FigureSupplier figureSupplies = new FigureSupplier();
    private static final int LENGTH_OF_ARRAY = 5;

    public static void main(String[] args) {
        Figure[] array = new Figure[LENGTH_OF_ARRAY];
        for (int i = 0; i < array.length; i++) {
            if (array.length / 2 >= i) {
                array[i] = figureSupplies.getRandomFigure();
            } else {
                array[i] = figureSupplies.getDefaultFigure();
            }
            array[i].print();
        }
    }
}
