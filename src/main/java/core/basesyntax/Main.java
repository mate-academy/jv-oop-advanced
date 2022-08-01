package core.basesyntax;

public class Main {
    private static final int FULL_ARRAY = 6;
    private static final int HALF_OF_ARRAY = 3;

    public static void main(String[] args) {
        FigureObject[] figureObjectArray = new FigureObject[6];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < FULL_ARRAY; i++) {
            if (i >= HALF_OF_ARRAY) {
                figureObjectArray[i] = supplier.getDefaultFigure();
                continue;
            }
            figureObjectArray[i] = supplier.getRandomFigure();
        }
        for (FigureObject figureObject : figureObjectArray) {
            figureObject.draw();
        }
    }
}
