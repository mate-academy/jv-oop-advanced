package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        int arraySize = 6;
        AbstractFigure [] figures = new AbstractFigure[arraySize];

        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = (AbstractFigure) figureSupplier.getRandomFigure();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = (AbstractFigure)figureSupplier.getDefaultFigure();
        }

        for (AbstractFigure  figure : figures) {
            figure.draw();
        }
    }
}
