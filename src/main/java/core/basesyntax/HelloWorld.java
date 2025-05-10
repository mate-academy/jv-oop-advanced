package core.basesyntax;

public class HelloWorld {
    private static final int MAGIC_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAGIC_FIGURE];

        for (int i = 0; i < MAGIC_FIGURE; i++) {
            if (i < MAGIC_FIGURE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }

}
