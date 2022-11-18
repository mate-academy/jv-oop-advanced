package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arraySize = 6;

        Figures[] figuresArray = new Figures[arraySize];
        FigureSupplier figure = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figuresArray[i] = figure.getRandomFigure();
            } else {
                figuresArray[i] = figure.defaultFigure();
            }
            figuresArray[i].drawFigure();
        }
    }
}
