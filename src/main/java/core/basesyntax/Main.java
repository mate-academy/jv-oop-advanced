package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] figures = new Drawable[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Drawable figure: figures) {
            figure.draw();
        }
    }
}
