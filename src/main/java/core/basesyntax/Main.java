package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        final int amount = 6;
        final int randomCount = 3;

        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] figures = new Figure[amount];

        for (int i = 0; i < figures.length; i++) {
            if (i < randomCount) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Drawable figure: figures) {
            figure.draw();
        }
    }
}
