package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] array = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
