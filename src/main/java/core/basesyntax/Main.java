package core.basesyntax;

public class Main {
    private static final int ARRAY_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_COUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = supplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
