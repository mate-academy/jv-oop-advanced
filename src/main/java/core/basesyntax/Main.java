package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int arraySize = 6; // Can be any size
        Figure[] figures = new Figure[arraySize];

        // Fill half of the array with random figures
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Fill the other half with default figures
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Display all figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}