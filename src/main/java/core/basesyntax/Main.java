package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < arraySize; i++) {
            figures[i].draw();
        }
    }
}
