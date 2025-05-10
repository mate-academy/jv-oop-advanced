package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH / 2) {
                System.out.println(figureSupplier.getRandomFigure().draw());
            } else {
                System.out.println(figureSupplier.getDefaultFigure().draw());
            }
        }
    }
}
