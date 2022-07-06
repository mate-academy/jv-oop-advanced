package core.basesyntax;

public class Main {
    private static final int FIGURES_QUANTITY = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_QUANTITY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            if (i < FIGURES_QUANTITY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawInfo();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].drawInfo();
            }
        }
    }
}
