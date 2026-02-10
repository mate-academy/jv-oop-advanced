package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figureArrayLength = 6;
        final int halfOfLenght = 2;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[figureArrayLength];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / halfOfLenght) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
