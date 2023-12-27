package core.basesyntax;

import core.basesyntax.supplier.ColorSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println(colorSupplier.getRandomColor());
    }
}
