package core.basesyntax;

public class Main {
    public static final int LIMIT_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[LIMIT_ARRAY];

        for (int i = 0; i < LIMIT_ARRAY; i++) {
            if (i % 2 == 0) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
