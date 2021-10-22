package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberOfFigures = 6;
        Figure[] arrayOfFigures = new Figure[numberOfFigures];

        for (int i = 0; i < numberOfFigures; i++) {
            if (i < numberOfFigures / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
                arrayOfFigures[i].draw();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
                arrayOfFigures[i].draw();
            }
        }
    }
}
