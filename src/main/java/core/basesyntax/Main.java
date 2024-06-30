package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = i < 3
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figureArray[i].draw();
        }
    }
}
