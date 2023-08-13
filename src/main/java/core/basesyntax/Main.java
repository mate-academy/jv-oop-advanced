package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i < SIZE_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
