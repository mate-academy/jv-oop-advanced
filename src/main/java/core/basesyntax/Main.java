package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6; // Константа для розміру масиву

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_OF_ARRAY];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}

