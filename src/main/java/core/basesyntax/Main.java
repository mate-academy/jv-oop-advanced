package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT - 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        figures[figures.length - 1] = figureSupplier.getDefaultFigure();
        figures[figures.length - 1].draw();
    }
}
