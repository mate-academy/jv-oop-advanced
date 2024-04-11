package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            figures[i] = i < arraySize / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
