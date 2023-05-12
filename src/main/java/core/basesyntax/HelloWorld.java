package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] array = new Figure[4];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figure.getRandomFigure();
                array[i].draw();
            } else {
                array[i] = figure.getDefaultFigure();
                array[i].draw();
            }
        }
    }
}
