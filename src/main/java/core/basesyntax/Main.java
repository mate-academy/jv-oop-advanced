package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int size = 5;
        Figure[] figures = new Figure[size];

        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < size / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = size / 2; i < size; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.draw();
        }
    }
}
