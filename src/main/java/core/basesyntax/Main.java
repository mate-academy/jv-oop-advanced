package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigure = new Figure[6];
        for (int i = 0; i < arrayOfFigure.length; i++) {
            if (i < arrayOfFigure.length / 2) {
                arrayOfFigure[i] = figureSupplier.getRandomFigure();
                arrayOfFigure[i].print();
            } else {
                arrayOfFigure[i] = figureSupplier.getDefaultFigure();
                arrayOfFigure[i].print();
            }
        }
    }
}
