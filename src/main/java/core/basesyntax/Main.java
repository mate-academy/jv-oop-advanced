package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figure[] RANDOM_FIGURE = new Figure[6];

    public static void main(String[] args) {
        for (int i = 0; i < RANDOM_FIGURE.length; i++) {
            if (i < RANDOM_FIGURE.length / 2) {
                RANDOM_FIGURE[i] = figureSupplier.getRandomFigure();
            } else {
                RANDOM_FIGURE[i] = figureSupplier.getDefaultFigure();
            }
            RANDOM_FIGURE[i].printFigure();
        }
    }
}
