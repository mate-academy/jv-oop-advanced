package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Supplier figureSupplier = new Supplier();
        int size = 6;
        Figure[] figures = new Figure[size];

        for (int i = 0; i < size / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = size / 2; i < size; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
