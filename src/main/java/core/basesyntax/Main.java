package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[20];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = supplier.getRandomFigure();
            figure[i].draw();
        }
    }
}
