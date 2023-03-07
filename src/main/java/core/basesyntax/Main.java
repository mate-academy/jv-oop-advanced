package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] testFigure = new Figure[6];
        testFigure[0] = figureSupplier.getRandomFigure();
        testFigure[1] = figureSupplier.getRandomFigure();
        testFigure[2] = figureSupplier.getRandomFigure();
        testFigure[3] = figureSupplier.getDefaultFigure();
        testFigure[4] = figureSupplier.getDefaultFigure();
        testFigure[5] = figureSupplier.getDefaultFigure();

        for (int i = 0; i < testFigure.length; i++) {
            testFigure[i].print();
        }
    }
}
