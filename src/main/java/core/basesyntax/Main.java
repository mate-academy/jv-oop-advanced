package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] myFigures = new Figure[6];
        for (int i = 0; i < myFigures.length; i++) {
            if (i < myFigures.length / 2) {
                myFigures[i] = figureSupplier.getRandomFigure();
            } else {
                myFigures[i] = figureSupplier.getDefaultFigure();
            }
            myFigures[i].print();
        }

    }
}
