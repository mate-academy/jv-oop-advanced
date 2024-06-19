package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        final int size = 6;
        Figure[] figures = new Figure[size];

        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }

    }
}
