package core.basesyntax;

public class Main {
    private static final int LENGTH_ARRAy = 4;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[LENGTH_ARRAy];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
