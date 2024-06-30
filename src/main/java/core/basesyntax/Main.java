package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final int HALF_ARRAY_SIZE = ARRAY_SIZE / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < HALF_ARRAY_SIZE) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
