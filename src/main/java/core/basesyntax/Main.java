package core.basesyntax;

public class Main {
    public static final int ARRAY_SIZE = 6;
    public static final int HALF_OF_ARRAY_SIZE = ARRAY_SIZE / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < HALF_OF_ARRAY_SIZE) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
