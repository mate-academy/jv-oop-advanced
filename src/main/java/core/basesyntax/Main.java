package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        final int arraySize = 4;

        Figure[] figure = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {

                figure[i] = figureSupplier.getDefaultFigure();
            }

        }

        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
