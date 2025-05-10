package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        // draw first random figures
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // draw 3 figures with default parameters
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        //draw all figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
