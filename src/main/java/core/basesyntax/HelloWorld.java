package core.basesyntax;

public class HelloWorld {
    private static final int NUMBER_OF_FIGURES = 3;
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < figures.length; i++) {
            if (i < NUMBER_OF_FIGURES) {
                figures[i] = new FigureSupplier().getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = defaultFigure;
                figures[i].draw();
            }
        }
    }
}
