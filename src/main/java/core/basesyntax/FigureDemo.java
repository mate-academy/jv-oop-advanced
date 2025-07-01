package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class FigureDemo {

    public static void main(String[] args) {

        int size = 3;
        int halfSize = 2;

        Figure[] array = new Figure[size];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < size; i++) {

            Figure randomFigure;

            if (i < halfSize) {
                randomFigure = figureSupplier.getRandomFigure();
            } else {
                randomFigure = figureSupplier.getDefaultFigure();
            }
            array[i] = randomFigure;
        }

        for (Figure figure : array) {
            System.out.println(figure.draw());
        }
    }
}
