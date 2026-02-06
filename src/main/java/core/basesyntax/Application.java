package core.basesyntax;

public class Application {
    private static final int SIZE = 6;
    private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE];

        for (int i = 0; i < HALF_SIZE; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = HALF_SIZE; i < SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.drawAFigure();
        }
    }
}
