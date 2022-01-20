package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrOfFigure = new Figure[6];
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
