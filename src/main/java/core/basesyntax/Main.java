package core.basesyntax;

public class Main {
    private static final int MAX_ARRAY_LENGTH = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_ARRAY_LENGTH];
        for (int i = 0; i < MAX_ARRAY_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = MAX_ARRAY_LENGTH / 2; i < MAX_ARRAY_LENGTH; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
