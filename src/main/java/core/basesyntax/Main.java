package core.basesyntax;

public class Main {
    private static final int START_INDEX = 0;
    private static final int FIGURES_AMOUNT = 6;
    private static final int HALF = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_AMOUNT];

        for (int i = START_INDEX; i < figures.length; i++) {
            if (i < figures.length / HALF) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
