package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = i >= NUMBER_OF_FIGURES / 2
                    ? figureSupplier.getDefaultFigure() : figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
