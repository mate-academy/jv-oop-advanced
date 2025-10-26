package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        int halfSize = ARRAY_SIZE / 2;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < halfSize) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
