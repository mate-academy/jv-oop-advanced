package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {

    private static final FigureSupplier figureSupplies = new FigureSupplier();

    public static void main(String[] args) {

        Figure getRandomFIgure = figureSupplies.getRandomFigure();
        Figure getDefaultFigure = figureSupplies.getDefaultFigure();

        Figure[] array = {getRandomFIgure, getDefaultFigure};

        for (Figure figures : array) {
            figures.print();
        }
    }
}
