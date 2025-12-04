package core.basesyntax;

public class Main {
    private static final int FIGURES_IN_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] figures = new Drawable[FIGURES_IN_ARRAY];

        for (int i = 0;i < 3;i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int y = 3;y < 6;y++) {
            figures[y] = figureSupplier.getDefaultFigure();
        }

        for (Drawable figure : figures) {
            figure.draw();

        }

    }

}
