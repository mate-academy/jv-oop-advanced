package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figureSupplier.getFigures().length; i++) {
            figureSupplier.getFigures()[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figureSupplier.getFigures().length; i++) {
            figureSupplier.getFigures()[i].printInfo();
        }
    }
}
