package core.basesyntax;

public class Application {
    private static final int NUM_FIGURES = 6;

    public static void main(String[] args) {
        Figures[] figures = new Figures[NUM_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUM_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = NUM_FIGURES / 2; i < NUM_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < NUM_FIGURES; i++) {
            System.out.println(figures[i].toString());
        }
    }
}
