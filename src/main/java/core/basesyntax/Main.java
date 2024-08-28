package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < ARRAY_SIZE / 2) {
                figures[i] = (Figure) figureSupplier.getRandomFigure();
            } else {
                figures[i] = (Figure) figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
