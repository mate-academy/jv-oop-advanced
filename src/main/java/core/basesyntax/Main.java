package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final Figure[] figures = new Figure[NUMBER_OF_FIGURES];
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        for (int i = 0; i < NUMBER_OF_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
