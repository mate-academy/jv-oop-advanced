package core.basesyntax;

public abstract class Main implements Drawable {
    private static final int SIZE = 6;

    public static void main(String[] args) {

        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE];
        for (int i = 0; i < SIZE; i++) {
            if ((i >= 0) && (i < SIZE / 2)) {
                figures[i] = supplier.getRandomFigure();
            }
            if ((i >= SIZE / 2) && (i < SIZE)) {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
