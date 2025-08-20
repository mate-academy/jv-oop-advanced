package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] figures = new Drawable[ARRAY_SIZE];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = (Drawable) figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = (Drawable) figureSupplier.getDefaultFigure();
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
