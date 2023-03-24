package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] arrayOfFigure = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                arrayOfFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigure[i] = figureSupplier.getDefaultFigure();
            }
        }
    }
}
