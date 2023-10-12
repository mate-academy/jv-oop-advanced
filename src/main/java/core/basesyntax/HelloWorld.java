package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] allFigures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            allFigures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            allFigures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : allFigures) {
            figure.draw();
        }
    }
}
