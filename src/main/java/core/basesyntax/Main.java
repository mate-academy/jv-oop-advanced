package core.basesyntax;

public class Main {
    public static final int FINAL_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] arrayOfFigures = new Figure[FINAL_ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FINAL_ARRAY_SIZE; i++) {
            if (i < FINAL_ARRAY_SIZE / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure arrayOfFigure : arrayOfFigures) {
            arrayOfFigure.draw();
        }
    }
}
