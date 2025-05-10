package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i >= ARRAY_SIZE / 2
                    ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
