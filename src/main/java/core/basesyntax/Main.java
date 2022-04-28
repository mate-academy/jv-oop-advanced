package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] arrayOfFigures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
            arrayOfFigures[i].toDraw();

        }
    }
}
