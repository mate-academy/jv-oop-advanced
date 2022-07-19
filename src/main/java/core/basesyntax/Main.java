package core.basesyntax;

public class Main extends FigureSupplier {
    private static final int ARRAY_LIMIT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LIMIT];
        for (int i = 0; i < ARRAY_LIMIT; i++) {
            if (i <= ARRAY_LIMIT / 2 - 1) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
