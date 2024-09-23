package core.basesyntax;

public class Main {
    private static final int SIZE_OF_THE_ARRAY = 10;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SIZE_OF_THE_ARRAY];

        for (int i = 0; i < figures.length; i++) {
            if (i < SIZE_OF_THE_ARRAY / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
