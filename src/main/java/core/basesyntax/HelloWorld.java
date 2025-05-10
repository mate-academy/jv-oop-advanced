package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURE_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_NUMBER];
        for (int i = 0; i < FIGURE_NUMBER; i++) {
            figures[i] = i < FIGURE_NUMBER / 2
                         ? figureSupplier.getRandomFigure()
                         : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
