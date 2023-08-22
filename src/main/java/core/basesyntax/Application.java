package core.basesyntax;

public class Application {
    private static final int NUMBER_SIX = 6;
    private static final int NUMBER_TWO = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_SIX];

        for (int i = 0; i < figures.length / NUMBER_TWO; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / NUMBER_TWO; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
