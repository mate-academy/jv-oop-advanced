package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int MAX_ARRAY_SIZE = 6;
        final int HALF_DIVIDER = 2;
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
