package core.basesyntax;

class Main {
    public static void main(String[] args) {
        final int arraySize = 6;
        Figure[] figures = new Figure[arraySize];

        FigureSupplier figureSupplier = new FigureSupplier();

        int half = arraySize / 2;

        for (int i = 0; i < half; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = half; i < arraySize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.draw();
        }
    }
}
