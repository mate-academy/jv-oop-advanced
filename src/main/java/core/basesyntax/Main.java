package core.basesyntax;

public class Main {
    private static final int MAIN_LOOP_COUNT = 10;

    public static void main(String[] args) {
        Drawable[] figures = new Drawable[MAIN_LOOP_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
