package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        FigureAbstract[] figures = new FigureAbstract[NUMBER_OF_FIGURE];
        for (int i = 0; i < NUMBER_OF_FIGURE; i++) {
            if (i < NUMBER_OF_FIGURE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
