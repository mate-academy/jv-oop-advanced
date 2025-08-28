package core.basesyntax;

public class Main {
    private static final int COUNT_FIGURES = 6;
    private static final int HALF_OF_LIST = COUNT_FIGURES / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < HALF_OF_LIST) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
