package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = supplier.getRandomFigure();
            figure[i].draw();
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = supplier.getDefaultFigure();
            figure[i].draw();
        }
    }
}
