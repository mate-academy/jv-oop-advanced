package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            if (i > (figures.length - 1) / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }

}
