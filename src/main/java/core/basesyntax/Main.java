package core.basesyntax;

public class Main {
    public static void main(String args[]) {
        printArray();
    }

    public static Figure[] listOfRandomFigures() {
        Figure[] array = new Figure[6];

        for(int i = 0; i < 3; i++) {
            array[i] = FigureSupplier.getRandomFigure();
        }

        for(int i = 3; i < 6; i++) {
            array[i] = FigureSupplier.getDefaultFigure();
        }

        return array;
    }

    public static void printArray() {
        for(Figure i : listOfRandomFigures()) {
            i.draw();
        }
    }
}
