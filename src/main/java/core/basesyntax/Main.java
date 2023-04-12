package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < (ARRAY_SIZE / 2)) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
