package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */

public class HelloWorld {
    public static void main(String[] args) {
        final int FigureCount = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FigureCount];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
