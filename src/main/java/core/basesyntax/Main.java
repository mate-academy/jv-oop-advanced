package core.basesyntax;

public class Main {
    private static final int index = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] figures = new Drawable[index];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
