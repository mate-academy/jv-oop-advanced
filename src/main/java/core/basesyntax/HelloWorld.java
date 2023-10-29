package core.basesyntax;

public class HelloWorld {
    private static final int SEPARATOR_THAT_DIVIDES_ARRAY_INTO_HALVES = 2;
    private static final int FIGURE_COUNT = 4;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());

        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / SEPARATOR_THAT_DIVIDES_ARRAY_INTO_HALVES)
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
