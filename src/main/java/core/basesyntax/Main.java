package core.basesyntax;

public class Main {
    private static final int FIGURE_NUMBER = 3;

    public static void main(String[] args) {
        Figure[] allFigures = new Figure[FIGURE_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURE_NUMBER; i++) {
            allFigures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure: allFigures) {
            figure.draw();
            figureSupplier.getDefaultFigure().draw();

        }
    }
}
