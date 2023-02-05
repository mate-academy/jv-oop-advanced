package core.basesyntax;

public class Application {
    private static final int FIGURE_QUANTITY = 6;
    private static final int HALF_OF_FIGURES = FIGURE_QUANTITY / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_QUANTITY];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURE_QUANTITY; i++) {
            if (i < HALF_OF_FIGURES) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.drawFigure();
        }
    }
}
