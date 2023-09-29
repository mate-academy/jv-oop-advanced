package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 6; // array size
        Figure[] figures = new Figure[arraySize];

        // Generate half of the default shapes
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        // We generate the other half randomly
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        // We display information about all shapes
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
