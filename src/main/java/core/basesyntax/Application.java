package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figures[] figures = new Figures[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
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
