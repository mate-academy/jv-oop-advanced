package core.basesyntax;

public class Application {
    private static final int NUM_FIGURES = 6;

    public static void main(String[] args) {
        Figures[] figures = new Figures[NUM_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUM_FIGURES; i++) {
            if (i < NUM_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figures figure: figures) {
            figure.draw();
        }
    }
}
