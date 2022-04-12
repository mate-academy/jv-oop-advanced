package core.basesyntax;

public class Application {
    private static final int FIGURES_COUNT = 7;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < (int) FIGURES_COUNT / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = (int) FIGURES_COUNT / 2; i < FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
