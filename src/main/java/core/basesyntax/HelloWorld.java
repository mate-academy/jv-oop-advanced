package core.basesyntax;

public class HelloWorld {
    public static final int MAX_FIGURE_COUNT = 8;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_FIGURE_COUNT];
        for (int i = 0; i < MAX_FIGURE_COUNT; i++) {
            if (i < MAX_FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].toDraw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].toDraw();
            }
        }
    }
}
