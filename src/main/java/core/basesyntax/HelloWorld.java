package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Figure[] array = new Figure[6];
        FigureSupplier supl = new FigureSupplier();
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = supl.getRandomFigure();
        }

        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = supl.getDefault();
        }
        for (int i = 0; i < array.length; i++) {
            array[i].getsSquare();
        }
    }
}
