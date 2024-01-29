package core.basesyntax;

public class Main {
    private static final int FIGURE_QUANTITY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_QUANTITY];
        for (int i = 0; i < FIGURE_QUANTITY; i++) {
            if (i < (FIGURE_QUANTITY / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
