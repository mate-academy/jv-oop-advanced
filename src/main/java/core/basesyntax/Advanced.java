package core.basesyntax;

public class Advanced {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Drawable[] figures = new Drawable[FIGURE_COUNT];

        for (int i = 0; i < FIGURE_COUNT / 2; i++) {
            figures[i] = (Drawable) supplier.getRandomFigure();
        }

        for (int i = FIGURE_COUNT / 2; i < FIGURE_COUNT; i++) {
            figures[i] = (Drawable) supplier.getDefaultFigure();
        }

        for (Drawable f : figures) {
            if (f != null) {
                f.draw();
            }
        }
    }
}
