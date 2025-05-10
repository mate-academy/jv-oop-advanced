package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static int LENGTH = 5;

    public static void main(String[] args) {
        Figure[] arrayRandomFigure = new Figure[LENGTH];
        FigureSupplier randomFigureGenerator = new FigureSupplier();
        for (int i = 0; i < LENGTH; i++) {
            arrayRandomFigure[i] = randomFigureGenerator.getRandomFigure();
        }
        for (Figure figure : arrayRandomFigure) {
            figure.draw();
        }
    }
}
