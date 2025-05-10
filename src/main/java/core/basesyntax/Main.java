package core.basesyntax;

public class Main {
    private static final int NUMBER_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_FIGURE; i++) {
            if (i < NUMBER_FIGURE / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < figure.length; i++) {
            figure[i].draw();
        }
    }
}
