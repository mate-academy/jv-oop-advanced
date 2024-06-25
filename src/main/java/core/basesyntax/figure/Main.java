package core.basesyntax.figure;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figure[] figures = new Figure[ARRAY_SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            figures[i] = i < ARRAY_SIZE / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
