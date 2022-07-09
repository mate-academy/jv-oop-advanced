package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        final int FIGURE_AMOUNT = 6;
        Figure [] figures = new Figure[FIGURE_AMOUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURE_AMOUNT/2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = FIGURE_AMOUNT/2; i < FIGURE_AMOUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.Draw();
        }
    }
}
