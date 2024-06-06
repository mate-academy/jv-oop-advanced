package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE];

        for (int i = 0; i < SIZE; i++) {
            if (i < SIZE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
