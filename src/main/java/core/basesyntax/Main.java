package core.basesyntax;

public class Main {
    private static final int AMOUNT = 10;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < AMOUNT; i++) {
            if (i < AMOUNT / 2) {
                System.out.println(figureSupplier.getRandomFigure().draw());
            } else {
                System.out.println("Default_" + figureSupplier.getDefaultFigure().draw());
            }
        }
    }
}
