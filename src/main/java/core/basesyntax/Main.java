package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int numberOfFigures = 6;
        Figure[] figureArray = new Figure[numberOfFigures];

        for (int i = 0; i < numberOfFigures / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
            figureArray[i].draw();
        }

        for (int i = numberOfFigures / 2; i < numberOfFigures; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
            figureArray[i].draw();
        }
    }
}
