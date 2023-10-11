package core.basesyntax;

public class Main {
    private static final int COUNT_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < COUNT_FIGURE; i++) {
            if (i < (COUNT_FIGURE / 2)) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefoultFigure().draw();
            }
        }
    }
}
