package core.basesyntax;

public class Main {
    private static final int ARR_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARR_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0, j = ARR_SIZE - 1; i < (ARR_SIZE / 2); i++, j--) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[j] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.toDraw());
        }
    }
}
