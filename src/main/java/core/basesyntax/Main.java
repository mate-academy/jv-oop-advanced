package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 20;
    private static final Figure[] FIGURES = new Figure[NUMBER_OF_FIGURES];
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                FIGURES[i] = figureSupplier.getRandomFigure();
            } else {
                FIGURES[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : FIGURES) {
            System.out.println(figure.draw());
        }
    }
}
