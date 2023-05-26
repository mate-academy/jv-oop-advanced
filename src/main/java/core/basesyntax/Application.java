package core.basesyntax;

public class Application {
    public static final int ARRAY_SIZE = 6;
    public static final int HALF_SIZE = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < HALF_SIZE) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            }
            if (i >= HALF_SIZE) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
