package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Program {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE];
        for (int i = 0; i < SIZE; ) {
            figures[i++] = figureSupplier.getRandomFigure();
            figures[i++] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.drawFigure();
        }
    }
}

