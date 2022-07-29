package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        Figure[] figures = new Figure[size];
        FigureSupplier figureSupplier = new FigureSupplier();
        int indexFigure = 0;
        for (; indexFigure < size / 2; indexFigure++) {
            figures[indexFigure] = figureSupplier.getRandomFigure();
        }
        for (; indexFigure < size; indexFigure++) {
            figures[indexFigure] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
