package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        int i;
        Figure[] figureArray = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (i = 0; i < figureArray.length / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }

        while (i < figureArray.length) {
            figureArray[i++] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figureArray) {
            figure.draw();
        }
    }
}
