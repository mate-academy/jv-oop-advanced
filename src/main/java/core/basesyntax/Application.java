package core.basesyntax;

public class Application {
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[LENGTH];
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < LENGTH; i = i + 2) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + 1] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            figures[i + 1].draw();
        }
    }
}
