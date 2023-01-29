package core.basesyntax;

public class Main {
    private static final int ARRAY_COUNT = 6;

    public static void main(String[] args) {
        Figure [] figures = new Figure [ARRAY_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_COUNT; i++) {
            if (i < ARRAY_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
