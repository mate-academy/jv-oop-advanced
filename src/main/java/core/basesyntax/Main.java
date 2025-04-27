package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int countOfFigure = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[countOfFigure];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < countOfFigure; i++) {
            if (i < (countOfFigure / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures){
            figure.drawFigure();
        }
    }
}
