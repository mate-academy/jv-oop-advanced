package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = supplier.getRandomFigure();
            } else {
                array[i] = supplier.getDefaultFigure();
            }
        }
        for (Figure figure : array) {
            if (figure instanceof Draw) {
                ((Draw) figure).draw();
            }
        }
    }
}
