package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        int arraySize = 6;

        Figure[] figures = new Figure[arraySize];

        // First half - random figures
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        // Second half - default figures
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        // Print all figures
        for (Figure figure : figures) {
            figure.todraw();
            System.out.println("-------------------------");
        }
    }
}
