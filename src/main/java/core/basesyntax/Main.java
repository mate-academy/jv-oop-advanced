package core.basesyntax;

public class Main {
    private static final int COUNT_OF_FIGURE = 6;
    private static final int COUNT_DEFAULT_FIGURE = COUNT_OF_FIGURE / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_OF_FIGURE];
        for (int i = 0; i < COUNT_OF_FIGURE; i++) {
            figures[i] = i < COUNT_DEFAULT_FIGURE
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
