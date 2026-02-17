package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        int n = 6;
        Figure[] figures = new Figure[n];
        for (int i = 0; i < n / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = n / 2; i < n; i++) {
            figures[i] = supplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
