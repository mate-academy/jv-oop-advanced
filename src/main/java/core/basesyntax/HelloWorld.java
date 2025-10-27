package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURES_COUNT = 6;
    private static final int RANDOM_FIGURES_COUNT = 3;
    public static void main(String[] args) {
            FigureSupplier figureSupplier = new FigureSupplier();
            Figure[] result = new Figure[FIGURES_COUNT];

            for (int i = 0; i < RANDOM_FIGURES_COUNT; i++) {
                result[i] = figureSupplier.getRandomFigure();
            }

            for (int i = RANDOM_FIGURES_COUNT; i < FIGURES_COUNT; i++) {
                result[i] = figureSupplier.getDefaultFigure();
            }

            for (Figure figure : result) {
                figure.draw();
            }
    }
}
