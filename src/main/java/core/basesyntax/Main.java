package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int numberOfFigures = 6;
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
