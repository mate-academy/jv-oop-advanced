package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int count = 10;

    public static void main(String[] args) {
        GetFigure figure = new GetFigure();
        GetFigureSupplier randomFigure = new GetFigureSupplier();
        GetFigure[] figures = new GetFigure[count];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? randomFigure.getRandomFigure()
                    : randomFigure.getDefaultFigure();
        }
        for (GetFigure f : figures) {
            f.drawFigure();
        }
    }
}
