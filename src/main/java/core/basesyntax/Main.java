package core.basesyntax;

public class Main {
    private static final int FIGURES_QUANTITY = 10;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            supplier.getRandomFigure().draw();
        }
    }
}
