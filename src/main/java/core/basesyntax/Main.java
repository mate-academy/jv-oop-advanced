package core.basesyntax;

public class Main {

    public static final int SIZE_OF_ARRAY = 9;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i != figures.length - 1
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].print();
        }
    }
}
