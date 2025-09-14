package core.basesyntax;
public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] figures = new Drawable[FIGURE_ARRAY_SIZE];
        for (int i = 0; i < FIGURE_ARRAY_SIZE / 2; i++) {
            figures[i] = (Drawable) figureSupplier.getRandomFigure();
        }
        for (int i = FIGURE_ARRAY_SIZE / 2; i < FIGURE_ARRAY_SIZE; i++) {
            figures[i] = (Drawable) figureSupplier.getDefaultFigure();
        }
        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
