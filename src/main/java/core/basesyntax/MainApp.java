package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class MainApp {
    private static int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i] = i < FIGURE_COUNT / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.toDraw());
        }
    }

}
