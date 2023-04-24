package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];
        for (int i = 0; i < NUMBER_OF_FIGURE; i++) {
            if (i < NUMBER_OF_FIGURE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
