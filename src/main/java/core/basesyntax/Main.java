package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int figureArraySize = 6;
        Figure[] figureArray = new Figure[figureArraySize];

        for (int i = 0; i < figureArraySize; i++) {
            if (i < figureArraySize / 2) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int j = 0; j < figureArraySize; j++) {
            figureArray[j].draw();
        }
    }
}
