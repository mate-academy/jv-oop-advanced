package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < SIZE_OF_ARRAY / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = SIZE_OF_ARRAY / 2; i < SIZE_OF_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            figures[i].draw();
        }
    }
}
