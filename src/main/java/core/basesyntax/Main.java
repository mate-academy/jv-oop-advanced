package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int j = 3; j < figures.length; j++) {
            figures[j] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.print();
        }
    }
}
