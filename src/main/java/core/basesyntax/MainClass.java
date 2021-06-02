package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class MainClass {
    private static final int FIGURE_ARRAY_LENGTH = 15;

    public static void main(String[] args) {
        Figure[] array = new Figure[FIGURE_ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < array.length; i++) {
            array[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < array.length; i++) {
            array[i].draw();
        }
    }
}
