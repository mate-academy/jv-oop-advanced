package core.basesyntax;

public class Main {
    public static final int AMOUNT_OF_THE_GENERATED_FIGURES = 6;
    private static final FigureSupplier supplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i < AMOUNT_OF_THE_GENERATED_FIGURES / 2) {
                supplier.getRandomFigure().draw();
            } else {
                supplier.getDefaultFigure().draw();
            }
        }
    }
}
