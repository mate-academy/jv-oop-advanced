package core.basesyntax;

public class Main {
    private static final int NUM_FIGURES = 6;
    public static void main(String[] args) {
        Figure[] figures = new Figure[NUM_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUM_FIGURES; i++) {
            if (i < NUM_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}