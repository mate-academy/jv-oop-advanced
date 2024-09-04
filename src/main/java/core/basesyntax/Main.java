package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FIGURE_QUANTITY = 6;
        final int MIDDLE_INDEX = FIGURE_QUANTITY / 2;
        final Figure[] figures = new Figure[FIGURE_QUANTITY];
        final FigureSupplier figureSupplier = new FigureSupplier();

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
