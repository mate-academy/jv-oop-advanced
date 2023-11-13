package core.basesyntax;

public class Main {
    private static final int NUBMER_OF_RANDOM_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUBMER_OF_RANDOM_FIGURES];

        for (int i = 0; i < NUBMER_OF_RANDOM_FIGURES; i++) {
            figures[i] = (i < 3) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }

    }
}
