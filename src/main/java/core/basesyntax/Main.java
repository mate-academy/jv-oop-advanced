package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        int countObjects = 5;
        Figure[] arrayOfFigures = new Figure[countObjects];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i <= arrayOfFigures.length / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : arrayOfFigures) {
            figure.draw();
        }
    }
}
