package core.basesyntax;

public class Main {

    private static final int arraySize = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();;
            } else {
                figures[i] = figureSupplier.getDefaultFigure();;
            }

            if (figures[i] != null) {

                figures[i].draw();
            }
        }
    }
}
