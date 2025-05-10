package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arrayLimit = 7;
        FigureSupplier supp = new FigureSupplier();
        int size = supp.getRandomInt(arrayLimit);

        Figure[] array = new Figure[size];

        for (int i = 0; i < size; i++) {
            if (size % 2 == 0) {
                array[i] = (size / 2 > i) ? (supp.getRandomFigure()) : (supp.getDefaultFigure());
            } else {
                array[i] = (size / 2 >= i) ? (supp.getRandomFigure()) : (supp.getDefaultFigure());
            }
        }

        for (Figure figure : array) {
            System.out.println(figure.draw());
        }
    }
}
