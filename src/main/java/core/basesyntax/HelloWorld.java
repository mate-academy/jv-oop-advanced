package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {

            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }

            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = figures.length / 2; i < figures.length; i++) {

        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
