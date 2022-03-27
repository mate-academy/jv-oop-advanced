package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] array = new Figure[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = new FigureSupplier().getRandomFigure();
            System.out.println(array[i] + "\n");
        }
    }
}
