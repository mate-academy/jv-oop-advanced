package core.basesyntax;

public class Main {
    private static final int FIGURE_QUANTITY = 6;
    private static final int MIDDLE_INDEX = FIGURE_QUANTITY / 2;
    private static final Figure[] figures = new Figure[FIGURE_QUANTITY];
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < FIGURE_QUANTITY; i++) {
            final Figure figure;

            if (i < MIDDLE_INDEX) {
                figure = figureSupplier.getRandomFigure();
            } else {
                figure = figureSupplier.getDefaultFigure();
            }

            figure.draw();
            figures[i] = figure;
        }
    }
}
