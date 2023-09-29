package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int figureCount = FigureSupplier.FIGURE_COUNT;
        Figure[] figures = new Figure[2 * figureCount];

        for (int i = 0; i < figureCount; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i + figureCount] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
