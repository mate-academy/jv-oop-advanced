package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            if (i == figures.length / 2) {
                figures[i] = figureSupplier.getDefoltFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }

}
