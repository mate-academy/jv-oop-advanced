package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        int counter = 0;

        for (int i = 0; i < figures.length / 2; i++) {
            counter++;
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i]);
        }

        for (int i = counter; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            System.out.println(figures[i]);
        }
    }
}
