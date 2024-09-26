package core.basesyntax;

public class Main {
    private static final int FIGURES_QUANTITY = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            if (i < 3) {
                supplier.getRandomFigure().draw();
                continue;
            }
            supplier.getDefaultFigure().draw();
        }
    }
}
