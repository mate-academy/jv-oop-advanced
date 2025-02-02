package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int number = 3;
        Figure[] figureArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < number; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }

        for (int i = number; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }

    }
}
