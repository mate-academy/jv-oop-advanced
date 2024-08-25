package core.basesyntax;

public class Main {
    private static final int ARRAYSIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAYSIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0, j = 3; i < 3 && j < 6; i++, j++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[j] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
