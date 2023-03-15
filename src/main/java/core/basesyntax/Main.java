package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] testFigure = new Figure[6];
        for (int i = 0; i < testFigure.length; i++) {
            if (i < testFigure.length / 2) {
                testFigure[i] = figureSupplier.getRandomFigure();
            } else {
                testFigure[i] = figureSupplier.getDefaultFigure();

            }
            testFigure[i].print();
        }
    }
}
