package core.basesyntax;

public class Main {

    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < (FIGURE_COUNT / 2); i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = (FIGURE_COUNT / 2); i < FIGURE_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
