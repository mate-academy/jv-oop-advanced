package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int arrayLength = 6;
        Figure[] figures = new Figure[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            figures[i] = (i < arrayLength / 2)
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
