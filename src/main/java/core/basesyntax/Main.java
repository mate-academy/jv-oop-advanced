package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figureCount = 6;

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[figureCount];
        for (int i = 0; i < figureCount; i++) {
            if (i < figureCount / 2) {
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
