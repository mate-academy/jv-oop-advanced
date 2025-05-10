package core.basesyntax;

public class MainApp {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE; i++) {
            Figure defaultFigure = figureSupplier.getDefaultFigure();
            figures[i] = defaultFigure;
            figures[i].draw();
        }
    }
}
