package core.basesyntax;

public class Main {
    private static final int countObjects = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[countObjects];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < arrayOfFigures.length / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
                arrayOfFigures[i].draw();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
                arrayOfFigures[i].draw();
            }
        }
    }
}
