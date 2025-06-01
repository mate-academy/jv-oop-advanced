package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int size = 6;
        Drawable[] figures = new Drawable[size];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < size / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = size / 2; i < size; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
