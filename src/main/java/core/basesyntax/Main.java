package core.basesyntax;

public class Main {
    public static final int COUNT_OF_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT_OF_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
