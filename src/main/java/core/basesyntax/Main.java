package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i % 2 == 0)
                    ? supplier.getRandomFigure()
                    : supplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
