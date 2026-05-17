package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int size = 6;
        Figure[] figures = new Figure[size];

        FigureSupplier supplier = new FigureSupplier();

        // перша половина — випадкові фігури
        for (int i = 0; i < size / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        // друга половина — дефолтні фігури
        for (int i = size / 2; i < size; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        // вивести всі фігури
        for (Figure f : figures) {
            f.draw();
        }
    }
}
