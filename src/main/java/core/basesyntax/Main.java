package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int figureCount = figureSupplier.getFigureCount();
        Figure[] figures = new Figure[2 * figureCount];

        for (int i = 0; i < figureCount; i++) {
            figures[i + figureCount] = figureSupplier.getRandomFigure();
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
