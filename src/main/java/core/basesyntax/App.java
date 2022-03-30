package core.basesyntax;

public class App {
    public static final int SIZE = 6;

    public static void main(String[] args) {
        Figure[] massOfFigure = new Figure[SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        int halfOfSizeMass = massOfFigure.length / 2;

        for (int i = 0; i < massOfFigure.length; i++) {
            if (i < halfOfSizeMass) {
                massOfFigure[i] = figureSupplier.getRandomFigure();
            } else {
                massOfFigure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure: massOfFigure) {
            figure.area();
            figure.draw();
        }

    }
}
