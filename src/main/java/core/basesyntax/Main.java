package core.basesyntax;

public class Main {
    private static final int COUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] array = new Figure[COUNT_OF_FIGURES];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = supplier.getRandomFigure();
            } else {
                array[i] = supplier.getDefaultFigure();
            }
        }
        for (Figure i : array) {
            i.getInformation();
        }

    }
}
