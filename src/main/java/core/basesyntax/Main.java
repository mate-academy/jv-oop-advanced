package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final int SIZE_OF_ARRAY = 10;

    public static void main(String[] args) {

        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        for (int i = 0; i < SIZE_OF_ARRAY / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = SIZE_OF_ARRAY / 2; i < SIZE_OF_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
