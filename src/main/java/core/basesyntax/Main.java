package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 6;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SIZE_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
