package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier randomFigure = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = randomFigure.getRandomFigure();
                figures[i].draw();

            } else {
                figures[i] = randomFigure.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
