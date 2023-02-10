package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FIGURES_QUANTITY = 10;
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            supplier.getRandomFigure().draw();
        }
    }
}
