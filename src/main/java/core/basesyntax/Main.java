package core.basesyntax;

public class Main {
    private static final int MAX_ARRAY_SIZE = 6;
    private static final int HALF_DIVIDER = 2;

    public static void main(String[] args) {
        Figure[] figure = new Figure[MAX_ARRAY_SIZE];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = i < MAX_ARRAY_SIZE / HALF_DIVIDER
                    ? supplier.getRandomFigure()
                    : supplier.getDefaultFigure();
            figure[i].draw();
        }
    }
}
