package core.basesyntax;

public class Application {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final int QUANTITY_FIGURES = 6;
    private static final int QUANTITY_SIC = 2;

    public static void main(String[] args) {
        Figure [] figures = new Figure[QUANTITY_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (figures.length % QUANTITY_SIC == 0) {
                figures [ i ] = figureSupplier.getRandomFigure();
            } else {
                figures [ i ] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();

        }
    }
}
