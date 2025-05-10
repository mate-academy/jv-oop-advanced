package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[FIGURES_COUNT - i - 1] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            figures[FIGURES_COUNT - i - 1].draw();
        }
    }
}
