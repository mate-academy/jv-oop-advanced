package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= 3) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
