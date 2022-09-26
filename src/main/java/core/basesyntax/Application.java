package core.basesyntax;

public class Application {
    public static final int FIGURE_RANDOM = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_RANDOM];
        for (int i = 0; i < FIGURE_RANDOM; i++) {
            if (i < FIGURE_RANDOM / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
