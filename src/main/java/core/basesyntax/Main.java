package core.basesyntax;

public class Main {
    private static final int TEST_SIZE = 6;

    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[TEST_SIZE];
        figures[TEST_SIZE - 1] = figureSupplier.getDefaultFigure();
        for (int i = 0; i < TEST_SIZE - 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        Figure defaultFigure = figureSupplier.getDefaultFigure();
        figures[TEST_SIZE - 1] = defaultFigure;
        figures[TEST_SIZE - 1].draw();
    }
}
