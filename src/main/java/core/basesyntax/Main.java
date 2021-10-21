package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figuresupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figuresupplier.getRandomFigure();
            } else {
                figures[i] = figuresupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
