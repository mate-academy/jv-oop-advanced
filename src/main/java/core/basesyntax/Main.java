package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        printArray();
    }

    public static Figure[] listOfRandomFigures() {
        Figure[] array = new Figure[6];

        for (int i = 0; i < 3; i++) {
            array[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            array[i] = figureSupplier.getDefaultFigure();
        }

        return array;
    }

    public static void printArray() {
        for (Figure i : listOfRandomFigures()) {
            i.draw();
        }
    }
}
