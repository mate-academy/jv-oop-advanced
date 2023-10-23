package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Figure[] array = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < array.length; i++) {
            if (i <= array.length / 2) {
                array[i] = supplier.getRandomFigure();
            } else {
                array[i] = supplier.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
