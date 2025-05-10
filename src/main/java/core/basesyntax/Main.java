package core.basesyntax;

public class Main {
    private static final int AMOUNT_OF_FIGURES = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];
        for (int i = 0; i < AMOUNT_OF_FIGURES; i++) {
            figures[i] = i <= AMOUNT_OF_FIGURES / 2 - 1
                       ? figureSupplier.getRandomFigure()
                       : figureSupplier.getDefaultFigure();

            figures[i].draw();
        }
    }
}
