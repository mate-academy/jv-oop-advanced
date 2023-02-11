package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figureCount = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[figureCount];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
