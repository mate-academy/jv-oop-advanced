package core.basesyntax;

public class HelloWorld {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        for (int i = 0; i < figures.length; i++) {
            if (i < SIZE_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = defaultFigure;
            }
            figures[i].draw();
        }
    }
}
