package core.basesyntax;

public class Main {
    private static final int ELEMENTS_IN_ARR = 6;

    public static void main(String[] args) {
        Figure[] arrOfFigure = new Figure[ELEMENTS_IN_ARR];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arrOfFigure.length; i++) {
            if (i < 3) {
                arrOfFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrOfFigure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : arrOfFigure) {
            figure.printFigure();
        }
    }
}
