package core.basesyntax;

public class Main {
    private static final int INDEX = 6;

    public static void main(String[] args) {
        FigureSupplier figures = new FigureSupplier();

        Figure[] array = new Figure[INDEX];
        for (int i = 0; i < array.length; i++) {
            if (i > 2) {
                array[i] = figures.getDefaultFigure();
            } else {
                array[i] = figures.getRandomFigure();
            }
            array[i].draw();
        }
    }
}
