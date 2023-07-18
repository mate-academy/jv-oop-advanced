package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        int arraySize = 6;
        AreaCalculator[] areaCalculators = new AreaCalculator[arraySize];

        for (int i = 0; i < arraySize / 2; i++) {
            areaCalculators[i] = figureSupplier.getRandomFigure();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            areaCalculators[i] = figureSupplier.getDefaultFigure();
        }

        for (AreaCalculator areaCalculator : areaCalculators) {
            areaCalculator.draw();
        }
    }
}
