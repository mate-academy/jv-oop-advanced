package core.basesyntax;

public class Main {
    public static final int RANDOM_FIGURES_AMOUNT = 3;
    public static final int TOTAL_FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[TOTAL_FIGURES_AMOUNT];

        for (int i = 0; i < TOTAL_FIGURES_AMOUNT; i++) {
            if (i < RANDOM_FIGURES_AMOUNT) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
