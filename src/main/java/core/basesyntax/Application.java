package core.basesyntax;

public class Application {
    private static final int FIGURE_COUNT = 6;
    private static final int HALF = FIGURE_COUNT / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < HALF) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
