package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE_INDEX = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE_INDEX];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
