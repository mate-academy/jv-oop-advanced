package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] array = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i <= 2; i++) {
            array[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < array.length; i++) {
            array[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : array) {
            figure.drawFigure();
        }
    }
}
