package core.basesyntax;

public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < SIZE; i++) {
            if (SIZE / 2 > i) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
