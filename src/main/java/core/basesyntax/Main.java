package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final int HALF_ARRAY_SIZE = ARRAY_SIZE / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < HALF_ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getRandomFigure(colorSupplier.getRandomColor());
        }
        for (int i = HALF_ARRAY_SIZE; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
