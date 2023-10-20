package core.basesyntax;

public class Main {
    static final int MAX_ARRAY_LENGTH = 6;

    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_ARRAY_LENGTH];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.obtainTheArea();
            figure.draw();
        }
    }
}
