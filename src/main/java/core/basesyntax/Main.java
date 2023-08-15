package core.basesyntax;

public class Main {
    private static final int NUM_FIGURES = 10;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[NUM_FIGURES];

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
