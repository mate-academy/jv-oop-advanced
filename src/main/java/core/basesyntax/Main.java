package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrayLength = 6;
        Figure [] figure = new Figure[arrayLength];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arrayLength; i++) {
            if (i < arrayLength / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            }
            if (i > arrayLength / 2) {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < arrayLength; i++) {
            figure[i].draw();
        }

    }
}
