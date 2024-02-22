package core.basesyntax;

public class Main {
    private static final int FIGURES_QUANTITY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_QUANTITY];

        for (int i = 0; i < figures.length; i++) {
            if (i < FIGURES_QUANTITY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
