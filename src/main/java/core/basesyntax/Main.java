package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arraySize = 6;
        int halfOfArraySize = arraySize / 2;
        Figure[] figureArray = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < halfOfArraySize; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = halfOfArraySize; i < arraySize; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure currentFigure : figureArray) {
            currentFigure.printInformation();
        }
    }
}
