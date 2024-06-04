package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int arraySize = 6; // or any other size
        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
