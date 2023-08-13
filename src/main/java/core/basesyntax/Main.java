package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            if (i > (ARRAY_SIZE - 1) / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].drew();
        }

    }
}
