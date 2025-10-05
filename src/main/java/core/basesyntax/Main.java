package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        int a = 6;
        Figure[] figures = new Figure[a];
        int half = a / 2;
        for (int i = 0; i < half; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = 0; i < a; i++) {
            figures[i] = supplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }

}
