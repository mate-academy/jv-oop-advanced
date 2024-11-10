package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    public static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            boolean isFirstPart = i < (FIGURES_LENGTH / 2);

            figures[i] = figureSupplier.getRandomFigure(isFirstPart);
            figures[i].drawDetails();
        }
    }
}
