package core.basesyntax;

public class Main {
    private static final int ROOF_SIZE_OF_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < ROOF_SIZE_OF_ARRAY; i++) {
            if (i < 3) {
                figureSupplier.getRandomFigure().drawInfo();
            } else {
                figureSupplier.getDefaultFigure().drawInfo();
            }
            if (i == 2) {
                System.out.println("");
            }
        }
    }
}