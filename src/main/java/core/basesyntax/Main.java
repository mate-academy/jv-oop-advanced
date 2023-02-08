package core.basesyntax;

public class Main {
    private static final int AMOUNT = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < AMOUNT; i++) {
            if (i < AMOUNT / 2) {
                System.out.println(figureSupplier.getRandomFigure().draw());
            } else {
                System.out.println("Default_" + figureSupplier.getDefaultFigure().draw());
            }
        }
    }
}
