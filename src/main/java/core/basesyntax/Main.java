package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i] = i < FIGURE_COUNT / 2
                    ? supplier.getRandomFigure() : supplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
