package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            System.out.println(supplier.getRandomFigure().getValue());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(supplier.getDefaultFigure().getValue());
        }
    }
}
