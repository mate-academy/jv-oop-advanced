package core.basesyntax;

public class Main {
    private static final int MAX_VALUE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < MAX_VALUE; i++) {
            if (i < 3) {
                figureSupplier.getRandomFigure().drawingField();
            } else {
                figureSupplier.getDefaultFigure().drawingField();
            }
        }
    }
}
