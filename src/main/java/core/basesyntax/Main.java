package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSuplier = new FigureSupplier();

        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSuplier.getRandomFigure();
        }
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = figureSuplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
