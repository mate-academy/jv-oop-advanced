package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure [] figures = new Figure[4];
        FigureSupplier figureSupplier = new FigureSupplier();
        int middle = figures.length / 2;
        for (int i = 0; i < 4;i++) {
            if (i < middle) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }

        }
    }
}
