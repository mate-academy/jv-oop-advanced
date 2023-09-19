package core.basesyntax;

public class Main {
    public static final int SIZE_OF_FIGURE_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_FIGURE_ARRAY];
        for (int i = 0; i < SIZE_OF_FIGURE_ARRAY; i++) {
            if (i < SIZE_OF_FIGURE_ARRAY / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
