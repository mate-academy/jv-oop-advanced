package core.basesyntax;

public class Main {
    private static final int MAX_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < MAX_ARRAY_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = MAX_ARRAY_SIZE / 2; i < MAX_ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
