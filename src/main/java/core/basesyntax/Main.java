package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < 10; i++) {
            supplier.getRandomFigure().draw();
        }
    }
}
