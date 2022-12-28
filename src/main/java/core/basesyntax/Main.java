package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure [] figures = new Figure[6];
        for (int y = 0; y < 3; y++) {
            figures[y] = supplier.getRandomFigure();
            figures[y].draw();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = supplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
