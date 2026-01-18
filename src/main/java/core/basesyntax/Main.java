package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drowable[] figures = new Drowable[6];

        for (int i = 0; i < figures.length/2; i++) {
            figures[i] = (Drowable) figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < figures.length; i++) {
            figures[i] = (Drowable) figureSupplier.getDefaultFigure();
        }

        for (Drowable figure : figures) {
            figure.draw();
        }

    }

}
