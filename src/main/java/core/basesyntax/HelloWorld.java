package core.basesyntax;

public class HelloWorld {
    private static final int NUM_FIGURES = 6;
    private static final int HALF_NUM_FIGURES = NUM_FIGURES / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUM_FIGURES];

        // Generating the first half of figures with random parameters
        for (int i = 0; i < HALF_NUM_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Generating the second half of figures with default parameters
        for (int i = HALF_NUM_FIGURES; i < NUM_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Displaying all figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
