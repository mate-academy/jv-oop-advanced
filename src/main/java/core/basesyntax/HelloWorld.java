package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static final int FIGURE_COUNT = 6;
    public static final int HALF = FIGURE_COUNT / 2;

    public static void main(String[] args) {
        Figures[] figures = new Figures[FIGURE_COUNT];
        Figures randomFigure = new FigureSupplier().getRandomFigure();
        Figures defaultFigure = new FigureSupplier().getDefaultFigure();

        for (int i = 0; i < 3; i++) {
            figures[i] = randomFigure;
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = defaultFigure;
        }

        for (Figures figure : figures) {
            figure.draw();
        }
    }

}
