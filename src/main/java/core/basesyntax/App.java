package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    final static int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
                figures[i] = figureSupplier.getRandomFigure(i <= 2);
                figures[i].drawDetails();
        }
    }
}
