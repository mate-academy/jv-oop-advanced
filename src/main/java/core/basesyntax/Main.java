package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[FIGURES_COUNT];

        int half = FIGURES_COUNT / 2;

        for (int i = 0; i < half; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = half; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
