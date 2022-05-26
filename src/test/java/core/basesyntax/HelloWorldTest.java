package core.basesyntax;

import core.basesyntax.supplier.FigureSupplier;
import org.junit.Test;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorldTest {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private Main main = new Main();


    @Test
    public void figureIsEmpty() {
        if (figureSupplier == null) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    @Test
    public void setFigureSupplier() {
        if (figureSupplier.getDefaultFigure() != null) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
