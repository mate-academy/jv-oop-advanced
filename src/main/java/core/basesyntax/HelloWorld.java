package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < arraySize; i++) {
            figures[i] = i < arraySize / 2 ? FigureSupplier.getRandomFigure()
                    : FigureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
