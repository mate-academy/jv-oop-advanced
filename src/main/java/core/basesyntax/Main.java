package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        int halfOfArray = SIZE_OF_ARRAY / 2;

        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (halfOfArray > i) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
