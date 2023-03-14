package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] finalFigures = new Figure[10];

        for (int i = 0; i < finalFigures.length / 2; i++) {
            finalFigures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = finalFigures.length / 2; i < finalFigures.length; i++) {
            finalFigures[i] = figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < finalFigures.length; i++) {
            finalFigures[i].getArea();
        }
    }
}
