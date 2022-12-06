package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = randomFigure.getRandomFigure();
                figures[i].getDrawing();
            } else {
                figures[i] = randomFigure.getDefaultFigure();
                figures[i].getDefaultDrawing();
            }
        }
    }
}
