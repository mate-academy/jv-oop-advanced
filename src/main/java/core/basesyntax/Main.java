package core.basesyntax;

public class Main {
    private static final int ARRAY_COUNT = 6;
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figure = new Figure[ARRAY_COUNT];
        for (int i = 0; i < ARRAY_COUNT; i++) {
            if (i < ARRAY_COUNT / 2) {
                figure[i] = supplier.getRandomFigure();
            } else {
                figure[i] = supplier.getDefaultFigure();
            }
            figure[i].draw();
        }
    }
}
