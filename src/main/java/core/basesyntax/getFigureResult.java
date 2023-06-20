package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class getFigureResult {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
            System.out.println();
        }
    }
}
