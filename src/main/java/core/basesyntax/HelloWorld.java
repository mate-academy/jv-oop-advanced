package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_COUNT; i++) {
            int half = FIGURES_COUNT / 2;
            Figure figure = i < half
                    ?
                    figureSupplier.getRandomFigure()
                    :
                    figureSupplier.getDefaultFigure();

            figure.draw();
        }
    }
}
