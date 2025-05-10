package core.basesyntax;

public class Main {
    private static final int MAX_FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[MAX_FIGURE_AMOUNT];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
