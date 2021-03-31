package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 * change LIMIT
 */
public class HelloWorld {

    public static void main(String[] args) {

        FigureSupplier supplier = new FigureSupplier();
        for (Shapes shaped : supplier.randomFigure()) {
            System.out.println(shaped.getDraw());
        }
    }
}
