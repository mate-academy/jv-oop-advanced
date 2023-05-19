package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SIZE_OF_ARRAY];

        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (i < SIZE_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
