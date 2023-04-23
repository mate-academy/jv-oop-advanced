package core.basesyntax;

public class Main {
    private static final int SIZE_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_ARRAY];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i < SIZE_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].printFigure());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].printFigure());
            }
        }
    }
}
