package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figure.drow();
        }
        for (int i = 0; i < 3; i++) {
            Figure figure = figureSupplier.getDefaultFigure();
            figure.drow();
        }
    }
}
