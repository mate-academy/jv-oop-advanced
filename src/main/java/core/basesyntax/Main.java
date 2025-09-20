package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = (Figure) supplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = (Figure) supplier.getDefaultFigure();
        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
