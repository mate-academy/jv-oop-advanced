package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        for (int i = 0;i < figureArray.length;i++) {
            if (i < 3) {
                figureArray[i] = new FigureSupplier().getRandomFigure();
            } else {
                figureArray[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure figure:figureArray) {
            figure.printInfo();
        }
    }
}
