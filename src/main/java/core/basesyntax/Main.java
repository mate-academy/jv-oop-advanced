package core.basesyntax;

public class Main {
    private static final int START_INDEX = 0;
    private static final int SIX_FIGURES = 6;
    private static final int HALF = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIX_FIGURES];

        for (int i = START_INDEX; i < figures.length; i++) {
            if (i < figures.length / HALF) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
