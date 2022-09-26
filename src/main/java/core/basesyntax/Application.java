package core.basesyntax;

public class Application {
    public static final int FIGURE_RANDOM = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_RANDOM + 1];
        for (int i = 0; i < FIGURE_RANDOM + 1; i++) {
            if (i == FIGURE_RANDOM) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
