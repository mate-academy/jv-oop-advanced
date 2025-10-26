package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arraySize = 6;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
