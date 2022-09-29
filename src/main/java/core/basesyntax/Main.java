package core.basesyntax;

public class Main {
    private static final int ALL_FIGURE = 6;

    public static void main(String[] args) {
        for (int i = 0; i < ALL_FIGURE; i++) {
            if (i < ALL_FIGURE / 2) {
                new FigureSupplier().getRandomFigure().drawFigure();
            } else {
                new FigureSupplier().getDefaultFigure().drawFigure();
            }
        }
    }
}
