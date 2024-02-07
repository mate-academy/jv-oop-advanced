package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
