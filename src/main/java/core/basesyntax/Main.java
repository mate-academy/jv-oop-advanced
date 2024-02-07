package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < FIGURES_COUNT / 2; i++) {
            figures[i] = figureSupplier.getDefultFigure();
        }
        for (int i = FIGURES_COUNT / 2; i < FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getDefultFigure();
        }
    }
}
