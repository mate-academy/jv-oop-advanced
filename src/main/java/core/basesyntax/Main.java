package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int N = 6;
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[N];

        for (int i = 0; i < N / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = N / 2; i < N; i++) {
            figures[i] = supplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
