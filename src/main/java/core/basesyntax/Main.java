package core.basesyntax;

public class Main {
    private static final int arrSize = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[arrSize];
        FigureSupplier figureSupplier = new FigureSupplier();

        // Fill first half with random figures
        int halfSize = arrSize / 2;
        for (int i = 0; i < halfSize; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Fill second half with default figures
        for (int i = halfSize; i < arrSize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Display all figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
