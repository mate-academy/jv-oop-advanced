package core.basesyntax;

public class Main {

    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        //create figure array
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

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
