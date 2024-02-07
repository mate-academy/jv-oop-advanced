package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final int ARRAY_HALF = 6 / 2;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = ZERO; i < ARRAY_SIZE; i++) {
            if (i < ARRAY_HALF) {
                figures[i] = figureSupplier.getRandomFigure();
            } else if (i >= ARRAY_HALF) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
