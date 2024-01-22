package core.basesyntax;

public class Main {
    public void main(String[] args) {
        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];

        FigureSupplier figureSupplier = new FigureSupplier();

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
