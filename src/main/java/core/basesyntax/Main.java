package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                supplier.getRandomFigure().draw();
                continue;
            }
            supplier.getDefaultFigure().draw();
        }
    }
}
