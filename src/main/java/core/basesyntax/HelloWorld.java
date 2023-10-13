package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] allFigures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < allFigures.length / 2) {
                allFigures[i] = figureSupplier.getRandomFigure();
            } else {
                allFigures[i] = figureSupplier.getDefaultFigure();
            }
            allFigures[i].draw();
        }
    }
}
