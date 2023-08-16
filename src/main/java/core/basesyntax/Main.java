package core.basesyntax;

public class Main {
    static final int TOTAL_FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[TOTAL_FIGURES_AMOUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < TOTAL_FIGURES_AMOUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
