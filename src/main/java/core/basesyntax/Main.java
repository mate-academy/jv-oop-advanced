package core.basesyntax;

public class Main {
    private static final int COUNT_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < COUNT_FIGURES; i++) {
            if (i < COUNT_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
