package core.basesyntax;

public class HelloWorld {

    public static void main(String[] args) {

        FigureSupplier supplier = new FigureSupplier();
        for (Shapes shaped : supplier.randomFigure()) {
            System.out.println(shaped.draw());
        }
    }
}
