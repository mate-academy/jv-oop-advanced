package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        // Generate the first half of the array with random figures
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(colorSupplier.getRandomColor());
        }

        // Generate the second half of the array with the default figure
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = defaultFigure;
        }

        // Display the list of figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
