package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE];

        for (int i = 0; i < SIZE; i++) {
            figures[i] = i < SIZE / 2 ? supplier.getRandomFigure() : supplier.getDefaultFigure();
        }

        for (var figure : figures) {
            figure.draw();
        }
    }
}
