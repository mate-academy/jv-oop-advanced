package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figure defaultFigure = figureSupplier.getDefaultFigure();

    public static void main(String[] args) {

        Figure[] figures = new Figure[SIZE_OF_ARRAY];
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
