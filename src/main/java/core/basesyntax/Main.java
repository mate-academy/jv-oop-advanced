package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    static final int ARRAY_LENGTH = 6;
    static final int FIRST_HALF = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] array = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < FIRST_HALF) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
