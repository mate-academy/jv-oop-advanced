package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 15;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].print();
        }
    }
}
