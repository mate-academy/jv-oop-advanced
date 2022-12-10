package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(figures[i].draw());
        }
    }
}
