package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
