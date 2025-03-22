package core.basesyntax;

package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < FIGURE_COUNT / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = FIGURE_COUNT / 2; i < FIGURE_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

}
