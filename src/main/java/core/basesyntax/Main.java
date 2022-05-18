package core.basesyntax;

public class Main {
    private static final int COUNTER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < COUNTER; i++) {
            if (i < COUNTER / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
