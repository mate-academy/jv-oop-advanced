package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] arrayOfFigure = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arrayOfFigure.length; i++) {
            if (i < arrayOfFigure.length / 2) {
                arrayOfFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigure[i] = figureSupplier.getDefaultFigure();
            }

            arrayOfFigure[i].draw();
        }
    }
}


