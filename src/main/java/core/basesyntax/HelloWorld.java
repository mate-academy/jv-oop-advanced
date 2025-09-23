package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? supplier.getRandomFigure() : supplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
