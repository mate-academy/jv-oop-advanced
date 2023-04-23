package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (i < 3) {
                figures[i] = new FigureSupplier().getRandomFigure();
                System.out.println();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }

    }
}
