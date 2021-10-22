package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
                arrayOfFigures[i].print();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
                arrayOfFigures[i].print();
            }
        }
    }
}

