package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberOfFigure = 6;
        Figure[] figures = new Figure[numberOfFigure];
        for (int i = 0; i < figures.length; i++) {
            if (i < numberOfFigure / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
