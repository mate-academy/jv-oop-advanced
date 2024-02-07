package core.basesyntax;

public class Main {
    private static final short COUNT_OF_FIGURES = 6;
    private static final short COUNT_DEFAULT_FIGURES = COUNT_OF_FIGURES / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_OF_FIGURES];
        for (short i = 0; i < COUNT_OF_FIGURES; i++) {
            figures[i] = i < COUNT_DEFAULT_FIGURES
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
