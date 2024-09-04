package core.basesyntax;

public class Main {
    private static final int MAX_FIGURE_LENGTH = 7;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Draw[] figures = new Draw[MAX_FIGURE_LENGTH];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].printProperties();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].printProperties();
            }
        }
    }
}
