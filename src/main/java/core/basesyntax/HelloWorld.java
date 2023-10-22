package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Figure[] array = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < array.length / 2; i++) {
            array[i] = supplier.getRandomFigure();
        }

        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = supplier.getDefault();
        }
        for (Figure figure : array) {
            figure.getArea();
            figure.draw();
        }
    }
}
