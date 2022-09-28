package core.basesyntax;

public class Main {
    private static final int FROM = 0;
    private static final int TO = 6;
    private static final int FIRST_HALF = TO / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = FROM; i < TO; i++) {
            if (i < FIRST_HALF) {
                figureSupplier.getRandomFigure()
                        .draw();
            } else {
                figureSupplier.getDefaultFigure()
                        .draw();
            }
        }
    }
}
