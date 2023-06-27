package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        //create figure array
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i <= NUMBER_OF_FIGURES / 2 - 1) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
