package core.basesyntax;

public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < SIZE; i++) {
            if (i < SIZE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}
